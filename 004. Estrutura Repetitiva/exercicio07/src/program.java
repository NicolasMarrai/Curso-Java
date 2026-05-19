import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			if (b != 0) {
				double result = (double) a / b;
				System.out.println(result);
			} else {
				System.out.println("divisao impossível");
			}
		}
		sc.close();
	}
}