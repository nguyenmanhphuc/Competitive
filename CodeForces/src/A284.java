import java.util.Scanner;

public class A284 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		/*
		 * int count = 0; int l = n - 1; for (int i = 1; i < n; ++i) { boolean
		 * check = true; for (int j = 1; j < l; ++j) { long mod = mod(i, j, n) -
		 * 1; if (mod == 0) { check = false; break; } }
		 * 
		 * if (check && mod(i, l, n) - 1 == 0) { count++; } }
		 * System.out.println(count);
		 */
		int l = n - 1;
		int count = 0;
		for (int i = 1; i < n; ++i) {
			if (gcd(i, l) == 1) {
				count++;
			}
		}
		System.out.println(count);
	}


	public static long mod(long a, long n, long mod) {
		if (n == 1) {
			return a % mod;
		}

		long b = mod(a, n >> 1, mod);

		b = (b * b) % mod;
		if ((n & 1) > 0) {
			b = (b * a) % mod;
		}

		return b;
	}

	public static int gcd(int a, int b) {
		int r = a % b;
		while (r > 0) {
			a = b;
			b = r;
			r = a % b;
		}

		return b;
	}
}
