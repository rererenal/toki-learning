import java.util.Scanner;

public class ATambahB {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int result = a + b;
		System.out.println(result);
	}
}
