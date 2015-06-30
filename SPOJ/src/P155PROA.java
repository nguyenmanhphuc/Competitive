import java.math.BigInteger;
import java.util.Scanner;

public class P155PROA {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// long a = in.nextLong();
		// long n = in.nextLong();
		// System.out.println(solve(1,1));
		solve(1, 2);
	}

	private static long solve(long a, long n) {
		long result = getNthfibo(n-1);
		System.out.println(result);
		if (result == 0) {
			result = 1000000006;
		} else {
			result--;
		}
		return BigInteger.valueOf(result).multiply(BigInteger.valueOf(a))
				.mod(BigInteger.valueOf(1000000007)).longValue();
	}

	public static long getNthfibo(long n) {

		long[][] result = { { 1, 0 }, { 0, 1 } }; // identity matrix.
		long[][] fiboM = { { 1, 1 }, { 1, 0 } };

		while (n > 0) {
			if (n % 2 == 1) {
				multMatrix(result, fiboM);
			}
			n = n / 2;
			multMatrix(fiboM, fiboM);
		}

		return result[1][0];
	}

	private static void multMatrix(long[][] m, long[][] n) {
		long a = m[0][0] * n[0][0] + m[0][1] * n[1][0];
		long b = m[0][0] * n[0][1] + m[0][1] * n[1][1];
		long c = m[1][0] * n[0][0] + m[1][1] * n[0][1];
		long d = m[1][0] * n[0][1] + m[1][1] * n[1][1];

		m[0][0] = a % 1000000007;
		m[0][1] = b % 1000000007;
		m[1][0] = c % 1000000007;
		m[1][1] = d % 1000000007;
	}

}
