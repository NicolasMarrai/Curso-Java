package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Students> student = new ArrayList<>();
		
		System.out.print("How many students? ");
		int N = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < N; i++) {
			System.out.println("Student #" + (i + 1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Grade1: ");
			double grade1 = sc.nextDouble();
			System.out.print("Grade2: ");
			double grade2 = sc.nextDouble();
			System.out.println();
			
			student.add(new Students(name, grade1, grade2));
			
		}
		
		System.out.println("Approved students:");
		
		for (Students x : student) {
			double media = (x.getNota1() + x.getNota2()) / 2;
			if (media >= 6.0) {
				System.out.println(x.getName());
			}
		}

		sc.close();
	}

}
