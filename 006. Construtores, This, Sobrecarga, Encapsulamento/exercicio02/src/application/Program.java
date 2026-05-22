package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee;
		
		System.out.println("Enter employee data:");
		System.out.print("Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Salary: ");
		double salary = sc.nextDouble();
		
		employee = new Employee(id, name, salary);
		
		System.out.println();
		System.out.println("Employee:");
		System.out.println(employee);
		
		System.out.println();
		System.out.print("Enter the percentage to increase salary: ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data:");
		System.out.println(employee);

		sc.close();
	}

}
