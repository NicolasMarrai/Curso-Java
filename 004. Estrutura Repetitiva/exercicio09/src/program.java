import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			int result = N % i;
			if (result == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}