package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		student.name = sc.nextLine();
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();

		System.out.println();
		System.out.println("FINAL GRADE = " + String.format("%.2f", student.finalGrade()));

		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", student.missingPoints()) + " POINTS");
		} else {
			System.out.println("PASS");
		}

		sc.close();
	}

}
