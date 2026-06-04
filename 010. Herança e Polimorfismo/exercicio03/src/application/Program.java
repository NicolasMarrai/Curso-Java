package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.HourlyEmployee;
import entities.SalariedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter number of employees: ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Hourly or salaried (h/s)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			if (ch == 'h') {
				System.out.print("Hours worked: ");
				double hoursWorked = sc.nextDouble();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();

				list.add(new HourlyEmployee(name, 0.0, hoursWorked, valuePerHour));

			} else {

				System.out.print("Base salary: ");
				double baseSalary = sc.nextDouble();
				System.out.print("Monthly bonus: ");
				double monthlyBonus = sc.nextDouble();

				list.add(new SalariedEmployee(name, baseSalary, monthlyBonus));

			}
			System.out.println();
		}

		System.out.println("EMPLOYEES AND SALARIES:");
		for (Employee emp : list) {
			System.out.println(emp);
		}

		double sum = 0.0;
		for (Employee emp : list) {
			sum += emp.salary();
		}

		System.out.println("TOTAL SALARIES: $ " + String.format("%.2f", sum));

		sc.close();
	}

}
