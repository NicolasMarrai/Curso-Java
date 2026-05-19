import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			System.out.print((int)Math.pow(i, 1) + " ");
			System.out.print((int)Math.pow(i, 2) + " ");
			System.out.println((int)Math.pow(i, 3));
		}
		

		sc.close();
	}

}
