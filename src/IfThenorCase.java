import java.util.Scanner;

public class IfThenorCase {
	private static Scanner scanner;

	public static void main(String[] args) {
	scanner = new Scanner(System.in);
	int N = scanner.nextInt();
		
		if (N>=10000) {
			System.out.println("puluhribuan");
		}else if (N>=1000) {
			System.out.println("ribuan");
		}else if (N>=100) {
			System.out.println("ratusan");
		}else if (N>=10) {
			System.out.println("puluhan");
		}else if (N>=1) {
			System.out.println("satuan");
		}
	}
}
