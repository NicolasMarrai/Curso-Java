package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> employees = new ArrayList<>();

		System.out.print("How many employees? ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();

			employees.add(new Employee(name, salary));

		}

		Employee highestSalary = employees.get(0);

		for (Employee currentEmployee : employees) {
			if (currentEmployee.getSalary() > highestSalary.getSalary()) {
				highestSalary = currentEmployee;
			}
		}

		System.out.println("HIGHEST SALARY:");
		System.out.println(highestSalary.getName());
		System.out.println(highestSalary.getSalary());

		sc.close();
	}

}
