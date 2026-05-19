import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valor = 0, total;
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();

		if (codigo == 1) {
			valor = 4;
		} else if (codigo == 2) {
			valor = 4.5;
		} else if (codigo == 3) {
			valor = 5;
		} else if (codigo == 4) {
			valor = 2;
		} else if (codigo == 5) {
			valor = 1.5;
		} else {
			System.out.println("nao existe esse codigo");
		}
		
		total = valor * quantidade;
		System.out.println("Total: R$ " + String.format("%.2f", total));

		sc.close();
	}

}
