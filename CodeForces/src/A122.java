import java.util.Scanner;

public class A122 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i = 4; i <= n; ++i) {
			if (isLuckyNumber(i) && n % i == 0) {
				System.out.println("YES");
				return;
			}
		}

		System.out.println("NO");

	}

	private static boolean isLuckyNumber(int number) {
		while (number > 0) {
			int lastDigit = number % 10;
			number /= 10;
			if (lastDigit != 4 && lastDigit != 7) {
				return false;
			}
		}
		return true;
	}

}
