import java.util.Scanner;

public class LuasSegitiga {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		double alas = scanner.nextDouble();
		double tinggi = scanner.nextDouble();
		double result = 0.5*alas*tinggi;
		String strDouble = String.format("%.2f", result); 
		System.out.println(strDouble);
	}
}
