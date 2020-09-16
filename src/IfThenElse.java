import java.util.Scanner;

public class IfThenElse {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		if (N>0) {
			System.out.println("positif");
		}else if (N<0) {
			System.out.println("negatif");
		}else
			System.out.println("nol");
	}
}
