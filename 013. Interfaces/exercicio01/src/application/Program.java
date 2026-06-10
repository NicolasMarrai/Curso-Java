package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Charge;
import entities.Subscription;
import services.StreamPay;
import services.SubscriptionService;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre os dados da assinatura:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor mensal: ");
		double monthlyValue = sc.nextDouble();
		
		Subscription obj = new Subscription(number, date, monthlyValue);
		
		System.out.print("Entre com o numero de meses: ");
		int n = sc.nextInt();
		
		SubscriptionService subscriptionService = new SubscriptionService(new StreamPay());
		
		subscriptionService.processSubscription(obj, n);
		
		System.out.println("Cobranças:");
		for (Charge charge : obj.getCharges()) {
			System.out.println(charge);
		}
		
		sc.close();
	}

}
