import java.util.Scanner;

class MYSTERY {
	public void solve() {
		// System.out.println(pow(1, 4, 10));
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int end = (int) Math.sqrt(a);
		long r = 1;
		int MODE = 20122007;
		for (int i = 1; i < end; ++i) {
			if (a % i == 0) {
				r = (r * (pow(3, i, MODE) - 1) % MODE);
				r = (r * (pow(3, a / i, MODE) - 1) % MODE);
			}
		}

		if (a % end == 0) {
			r = (r * (pow(3, end, MODE) - 1) % MODE);
			if (a / end != end) {
				r = (r * (pow(3, a / end, MODE) - 1) % MODE);
			}
		}

		System.out.println(r);
	}

	private long pow(int c, int m, int mODE) {
		if (m == 1) {
			return c;
		}
		if (m == 0) {
			return 1;
		}
		long r = pow(c, m / 2, mODE);
		r = (r * r) % mODE;
		if ((m & 1) != 0) {
			r = (r * c) % mODE;
		}
		return r;
	}
}
