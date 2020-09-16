import java.util.Scanner;

public class IfThenMulti {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		if (N > 0 && N%2==0) {
			System.out.println(N);
		}
}
}
