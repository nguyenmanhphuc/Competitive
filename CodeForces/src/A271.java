import java.util.Scanner;

public class A271 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (true) {
			n++;
			if (n < 10 || isDistinct(n)) {
				System.out.println(n);
				return;
			}
		}

	}

	private static boolean isDistinct(int n) {
		boolean digits[] = new boolean[10];
		int countDistinct = 0;
		int countDigit = 0;
		while (n > 0) {
			countDigit++;
			int lastDigit = n % 10;
			n /= 10;
			if (!digits[lastDigit]) {
				digits[lastDigit] = true;
				countDistinct++;
			}
		}

		if (countDigit == countDistinct) {
			return true;
		}
		return false;
	}

}
