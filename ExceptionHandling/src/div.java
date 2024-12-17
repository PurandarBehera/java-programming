import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class div {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/*
		 * String s = "welcometojava"; System.out.println(s.length());
		 * System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
		 */
		try {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			System.out.println(x / y);
		} catch (ArithmeticException | InputMismatchException e) {
			if (e instanceof ArithmeticException) {
				System.out.println("java.lang.ArithmeticException- by zero");
			} else if (e instanceof InputMismatchException) {
				System.out.println("java.util.InputMismatchException- input mismatched");
			}
		}
		scanner.close();
	}

}
