import java.util.Scanner;

public class A483 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long l = in.nextLong();
		long r = in.nextLong();
		if (r - l < 2) {
			System.out.println(-1);
			return;
		}
		if (l - r == -2 && gcd(r, l) == 1) {
			System.out.println(-1);
			return;
		}
		if (r - l == 2) {
			System.out.println(l + " " + (l + 1) + " " + r);
			return;
		}

		l += l % 2 == 0 ? 0 : 1;
		System.out.println(l + " " + (l + 1) + " " + (l + 2));

	}

	static long gcd(long a, long b) {
		if (a % b == 0) {
			return b;
		} else {
			return gcd(b, a % b);
		}
	}

}
