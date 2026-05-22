package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Car;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Car car;

		System.out.println("Enter car data:");
		System.out.print("Model: ");
		String model = sc.nextLine();

		System.out.print("Is there initial fuel (y/n)? ");
		char response = sc.next().charAt(0);

		if (response == 'y') {

			System.out.print("Initial fuel: ");
			double fuel = sc.nextDouble();

			car = new Car(model, fuel);
		} else {
			car = new Car(model);
		}

		System.out.println();
		System.out.println("Car data:");
		System.out.println(car);

		System.out.println();
		System.out.print("How many km to drive? ");
		double km = sc.nextDouble();

		car.drive(km);

		System.out.println();
		System.out.println("Updated car data:");
		System.out.println(car);

		System.out.println();
		System.out.print("How many liters to refuel? ");
		double liters = sc.nextDouble();

		car.refuel(liters);

		System.out.println();
		System.out.println("Updated car data:");
		System.out.println(car);

		sc.close();
	}

}
