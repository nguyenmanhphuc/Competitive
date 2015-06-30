import java.util.Scanner;

public class The3nplus1Problem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long count[] = new long[1000001];
		for (int i = 1; i <= 1000000; ++i) {
			count[i] = findResult(i) + 1;
		}
		while (in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			long max = 0;
			int left = Math.min(a, b);
			int right = Math.max(a, b);
			for (int i = left; i <= right; ++i) {
				max = Math.max(max, count[i]);
			}
			System.out.println(a + " " + b + " " + max);
		}

	}

	private static long findResult(long n) {
		long result = 0;
		while (n != 1) {
			result++;
			if ((n & 1) == 0) {
				n = n >> 1;
			} else {
				n = 3 * n + 1;
			}
		}
		return result;
	}
}
