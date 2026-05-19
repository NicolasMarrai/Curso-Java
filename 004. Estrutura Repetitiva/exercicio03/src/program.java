import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int cont_a = 0, cont_g = 0, cont_d = 0;

		while (x != 4) {

			switch (x) {
			case 1:
				cont_a += 1;
				break;
			case 2:
				cont_g += 1;
				break;
			case 3:
				cont_d += 1;
				break;
			}

			x = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + cont_a);
		System.out.println("Gasolina: " + cont_g);
		System.out.println("Diesel: " + cont_d);

		sc.close();
	}

}
