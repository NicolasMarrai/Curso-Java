package application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("How many products? ");
		int N = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i<N; i++) {
			System.out.println("Product #" + (i + 1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			System.out.println();
			
			products.add(new Product(name, price));
			
		}
		
		Product mostExpensive = products.get(0);
		
		for (Product product : products) {
			if (product.getPrice() > mostExpensive.getPrice()) {
				mostExpensive = product;
			}
		}
		
		System.out.println();
        System.out.println("MOST EXPENSIVE PRODUCT:");
        System.out.println(mostExpensive.getName());
        System.out.printf("%.2f%n", mostExpensive.getPrice());

		sc.close();
	}

}
