package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Integer> numbers = new ArrayList<>();
		
		System.out.print("How many numbers? ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			int number = sc.nextInt();
			numbers.add(number);
		}
		
		System.out.println();
		System.out.print("Which number remove? ");
		Integer excluir = sc.nextInt();
		
		numbers.removeIf(x -> x == excluir);
		
		System.out.println("Updated list: ");
		for (Integer result : numbers) {
			System.out.println(result);
		}
		
		sc.close();
	}

}
