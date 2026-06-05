package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Car;
import entities.Motorcycle;
import entities.Vehicle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Vehicle> list = new ArrayList<>();

		System.out.print("Enter number of vehicles: ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.println("Vehicle #" + i + ":");
			System.out.print("Car or motorcycle (c/m)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Model: ");
			sc.nextLine();
			String model = sc.nextLine();
			System.out.print("Year: ");
			int year = sc.nextInt();
			System.out.print("Daily rate: ");
			double dailyRate = sc.nextDouble();
			System.out.print("Rental days: ");
			int rentalDays = sc.nextInt();

			if (ch == 'c') {
				System.out.print("Number of seats: ");
				int numbersOfSeats = sc.nextInt();
				System.out.print("Has air conditioning (y/n)? ");
				char airChar = sc.next().charAt(0);
				boolean air = (airChar == 'y');

				list.add(new Car(model, year, dailyRate, rentalDays, numbersOfSeats, air));
				
			} else {
				System.out.print("Cylinder capacity: ");
				int capacity = sc.nextInt();
				
				list.add(new Motorcycle(model, year, dailyRate, rentalDays, capacity));
				
			}
			
			System.out.println();

		}
		
		System.out.println("RENTAL SUMMARY:");
		for (Vehicle v : list) {
			System.out.println(v);
		}
		
		double sum = 0.0;
		for (Vehicle v : list) {
			sum += v.rentalCost();
		}
		
		System.out.println("TOTAL REVENUE: $ " + String.format("%.2f", sum));

		sc.close();
	}

}
