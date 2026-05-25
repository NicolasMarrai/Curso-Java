package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Alturas;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Alturas> list = new ArrayList<>();

		System.out.print("How many people? ");
		int N = sc.nextInt();
		System.out.println();
		
		double sum = 0.0;

		for (int i = 0; i < N; i++) {
			System.out.println("Person #" + (i + 1) + ": ");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Height: ");
			double heigth = sc.nextDouble();
			System.out.println();

			list.add(new Alturas(name, heigth));
			
			sum += heigth;

		}
		
		double media = sum / N;
		
		System.out.println("Average height = " + String.format("%.2f", media));
		System.out.println();
		
		System.out.println("People above average:");
		for(Alturas x : list) {
			if(x.getHeigth() > media) {
				System.out.println(x.getName());
			}
		}

		sc.close();
	}

}
