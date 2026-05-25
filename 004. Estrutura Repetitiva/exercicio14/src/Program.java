import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();

		int[] vect = new int[N];

		int qntd = 0;

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();

			if (vect[i] % 2 == 0) {
				qntd++;
			}

		}

		System.out.println();
		System.out.println("NUMEROS PARES:");
		for (int i = 0; i < N; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + "  ");
			}
		}

		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + qntd);

		sc.close();
	}

}
