import java.util.Scanner;

public class BebekUntukTeman {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int result = a/b;
		int sisa = a%b;
		System.out.println("masing-masing "+result);
		System.out.println("bersisa "+sisa);
			
		
	}
}
