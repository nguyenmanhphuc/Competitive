import java.util.Scanner;

public class B100694 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long p = in.nextLong();
		long n = in.nextLong();
		long x = in.nextLong();
		long zz = x / p;

		long left = zz * p;
		long right = left + p;
		long k1 = x - left;
		long k2 = Math.min(right, n) - x;
		long m = Math.min(k1, k2 + 1) + zz;

		long most = (n + p - 1) / p;

		long l = (n - x) / p;
		most += l;
		long t = n - l * p;
		m = Math.min(m, t - x + most);
		t -= p;
		if (t < 0) {
			t = 0;
		}
		m = Math.min(m, x - t + most + 1);

		System.out.println(m);
	}
}
