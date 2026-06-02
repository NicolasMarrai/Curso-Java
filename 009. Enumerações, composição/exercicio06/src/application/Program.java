package application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Invoice;
import entities.InvoiceItem;
import entities.Product;
import entities.enums.InvoiceStatus;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter company data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("CNPJ: ");
		String cnpj = sc.nextLine();
		System.out.print("Address: ");
		String address = sc.nextLine();
		
		Company company = new Company(name, cnpj, address);
		
		System.out.println("Enter invoice data:");
		System.out.print("Status: ");
		InvoiceStatus status = InvoiceStatus.valueOf(sc.next());
		System.out.print("Discount (%): ");
		double discount = sc.nextDouble();
		
		Invoice invoice = new Invoice(new Date(), status, discount, company);
		
		System.out.print("How many items? ");
		int n = sc.nextInt();
		for(int i = 1; i<= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Code: ");
			sc.nextLine();
			String code = sc.nextLine();
			System.out.print("Description: ");
			String description = sc.nextLine();
			System.out.print("Unit price: ");
			double unitPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(code, description, unitPrice);
			InvoiceItem invoiceItem = new InvoiceItem(quantity, unitPrice, product);
			invoice.addItem(invoiceItem);
			
		}
		
		System.out.println();
		System.out.println("INVOICE SUMMARY:");
		System.out.println(invoice);

		sc.close();
	}

}
