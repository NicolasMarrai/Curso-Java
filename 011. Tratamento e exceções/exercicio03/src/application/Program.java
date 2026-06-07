package application;

import java.util.Locale;
import java.util.Scanner;

import exceptions.TransferException;
import model.entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-- conta origem --");
		System.out.print("Number: ");
		int number1 = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder1 = sc.nextLine();
		System.out.print("Balance: ");
		double balance1 = sc.nextDouble();
		System.out.println();
		
		BankAccount acc1 = new BankAccount(number1, holder1, balance1);
		
		System.out.println("-- conta destino --");
		System.out.print("Number: ");
		int number2 = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder2 = sc.nextLine();
		System.out.print("Balance: ");
		double balance2 = sc.nextDouble();
		
		BankAccount acc2 = new BankAccount(number2, holder2, balance2);
		
		System.out.print("Transfer amount: ");
		double amount = sc.nextDouble();
		System.out.println();
		
		try {
			acc1.transfer(amount, acc2);
			System.out.println("Transfer successful!");
			System.out.println(acc1);
			System.out.println(acc2);
		} catch (TransferException e) {
			System.out.println("Transfer error: " + e.getMessage());
		}
		
		sc.close();
	}

}
