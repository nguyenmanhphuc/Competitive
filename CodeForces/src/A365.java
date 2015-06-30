import java.util.Scanner;

public class A365 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int count = 0;
		for (int i = 0; i < n; ++i) {
			if (isGoodNumber(in.nextInt(), k)) {
				count++;
			}
		}
		System.out.println(count);

	}

	private static boolean isGoodNumber(int number, int k) {
		boolean digits[] = new boolean[10];
		int count = 0;
		while (number > 0) {
			int digit = number % 10;
			if (!digits[digit] && digit <= k) {
				count++;
			}
			digits[digit] = true;
			number /= 10;
		}

		return count >= k + 1;

	}

}
