import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if ((Math.max(x, y) % Math.min(x, y)) == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Nao Sao Multiplos");
		}
		
		sc.close();
	}

}
