package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter file path: ");
		String sourceFileStr = sc.nextLine();

		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();

		boolean success = new File(sourceFolderStr + "\\out").mkdir();

		String targetFileStr = sourceFolderStr + "\\out\\report.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			
			String itemTxt = br.readLine();

			while (itemTxt != null) {

				String[] fields = itemTxt.split(",");
				
				String name = fields[0];
				String department = fields[1];
				double salary = Double.parseDouble(fields[2]);

				list.add(new Employee(name, department, salary));
				
				itemTxt = br.readLine();
			}
			
			if (list.isEmpty()) {
				System.out.println("File is empty.");
				sc.close();
				return;
			}
			
			double sumSalary = 0.0;
			
			for (Employee emp : list) {
				sumSalary += emp.getSalary();
			}
			
			double average = sumSalary / list.size();

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				for (Employee emp : list) {
					
					if (emp.getSalary() > average) {
						bw.write(emp.getName() + "," + String.format("%.2f", emp.getSalary()));
						bw.newLine();
					}
				}
				
				System.out.println(targetFileStr + " CREATED!");

			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		sc.close();
	}

}
