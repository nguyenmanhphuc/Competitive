import java.util.Scanner;

public class A235 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		if (a % 2 == 0) {
			long result = (a - 1) * (a - 2) * (a - 3);
			result = Math.max((a - 1) * (a - 2) * (a - 0), result);
			System.out.println(Math.max(result, 1));
		}

		else {
			long result = (a - 1) * (a - 2) * (a - 0);
			System.out.println(Math.max(result, 1));
		}
	}

	private static long gcd(long l, long i) {
		if (l % i == 0) {
			return i;
		}
		return gcd(i, l % i);
	}

}
