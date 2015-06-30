import java.util.Scanner;

public class D151 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();

		if (k == 1) {
			System.out.println(pow(m, n, 1000000007));
			return;
		} else if (k == n) {
			System.out.println(pow(m, (n + 1) / 2, 1000000007));
			return;
		}

		if (n < k) {
			int l = Math.min((k + 1) / 2, n);
			System.out.println(pow(m,n, 1000000007));
		} else {
			if (k % 2 == 1) {
				System.out.println(m * m);
			} else {
				System.out.println(m);
			}
		}

	}

	static long pow(long a, long b, long MOD) {
		long x = 1, y = a;
		while (b > 0) {
			if (b % 2 == 1) {
				x = (x * y);
				if (x > MOD)
					x %= MOD;
			}
			y = (y * y);
			if (y > MOD)
				y %= MOD;
			b /= 2;
		}
		return x;
	}

}
