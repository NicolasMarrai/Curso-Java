package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import model.entities.Sale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Sale> list = new ArrayList<>();

		System.out.print("Enter file path: ");
		String sourceFileStr = sc.nextLine();

		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();

		boolean success = new File(sourceFolderStr + "\\out").mkdir();

		String targetFileStr = sourceFolderStr + "\\out\\summary.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String itemTxt = br.readLine();

			while (itemTxt != null) {

				String[] fields = itemTxt.split(",");
				String date = fields[0];
				String seller = fields[1];
				double amount = Double.parseDouble(fields[2]);

				list.add(new Sale(date, seller, amount));

				itemTxt = br.readLine();
			}

			Map<String, Double> totals = new HashMap<>();

			for (Sale sale : list) {

				String seller = sale.getSeller();

				totals.put(seller, totals.getOrDefault(seller, 0.0) + sale.getAmount());
			}

			List<Map.Entry<String, Double>> ranking = new ArrayList<>(totals.entrySet());

			ranking.sort((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()));

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				for (Map.Entry<String, Double> entry : ranking) {

					bw.write(entry.getKey() + "," + String.format("%.2f", entry.getValue()));

					bw.newLine();
				}

				System.out.println(targetFileStr + " CREATED!");
			}

			catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		}

		catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		sc.close();
	}
}
