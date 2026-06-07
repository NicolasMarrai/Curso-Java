package application;

import java.util.Locale;
import java.util.Scanner;

import exceptions.ProductException;
import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product prod = new Product(name, price, quantity);
			
			System.out.print("Adjustment (%): ");
			double percent = sc.nextDouble();
			
			prod.adjustPrice(percent);
			
			System.out.println("Updated price: $ " + String.format("%.2f", prod.getPrice()));
		}
		catch (ProductException e) {
			System.out.println("Product error: " + e.getMessage());
		}
		sc.close();
	}

}
