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
		
		for(int i = 0; i<N; i++) {
			System.out.print("Enter a number: ");
			int number = sc.nextInt();
			
			numbers.add(number);
		}
		
		int sum = 0;
		
		for (Integer x : numbers) {
			if (x%2 == 0) {
				sum += x;
			}
		}
		
		System.out.println();
        System.out.println("SUM OF EVEN NUMBERS = " + sum);

		sc.close();
	}

}
