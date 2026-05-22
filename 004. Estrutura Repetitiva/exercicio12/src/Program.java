import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		
		double[] vect = new double[N];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		
		double sum = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + "  ");
			sum += vect[i];
		}
		
		System.out.println();
		System.out.println("SOMA = " + sum);
		
		double media = sum / vect.length;
		System.out.println("MEDIA = " + media);

		sc.close();
	}

}
