package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alturas;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();
		sc.nextLine();

		Alturas[] vect = new Alturas[N];

		double sum = 0.0;

		for (int i = 0; i < N; i++) {

			System.out.println("Dados da " + (i + 1) + "a pessoa:");

			System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("Idade: ");
			int age = sc.nextInt();

			System.out.print("Altura: ");
			double height = sc.nextDouble();

			sc.nextLine();

			vect[i] = new Alturas(name, age, height);

			sum += height;
		}

		double media = sum / N;

		int menores = 0;

		for (int i = 0; i < N; i++) {

			if (vect[i].getAge() < 16) {
				menores++;
			}
		}

		double porcentagem = ((double) menores / N) * 100.0;

		System.out.println();

		System.out.printf("Altura média: %.2f%n", media);

		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

		for (int i = 0; i < N; i++) {

			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}

		sc.close();
	}

}
