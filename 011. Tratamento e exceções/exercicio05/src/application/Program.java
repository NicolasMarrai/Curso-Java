package application;

import java.util.Locale;
import java.util.Scanner;

import exceptions.LowStockException;
import exceptions.StockException;
import model.entities.StockItem;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		System.out.print("Min stock: ");
		int minStock = sc.nextInt();
		System.out.print("Cost: ");
		double unitCost = sc.nextDouble();
		System.out.println();

		StockItem item = new StockItem(name, quantity, minStock, unitCost);

		try {
			System.out.print("Operation (in/out): ");
			String operation = sc.next();
			System.out.print("Amount: ");
			int amount = sc.nextInt();

			if (operation.equals("in")) {
				item.addStock(amount);
			} else {
				item.removeStock(amount);
			}

			System.out.println();
			System.out.println("Stock updated!");
			System.out.println(item);
		} catch (LowStockException e) {
			System.out.println(e.getMessage());
		} catch (StockException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
