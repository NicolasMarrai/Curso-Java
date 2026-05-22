package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double balance = 0.0;
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		
		if (initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			 balance = sc.nextDouble();
		}
		
		Account acc = new Account(number, holder, balance);
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(acc);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		acc.deposit(deposit);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		acc.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		
		sc.close();
	}
}