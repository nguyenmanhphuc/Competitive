import java.util.Scanner;

public class D100187 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long result = pow(3, n, 1000000009);
		result -= 2 * pow(2, n, 1000000009);
		result += 1;
		result %= 1000000009;
		if (result < 0) {
			result += 1000000009;
		}
		System.out.println(result);
	}

	public static long pow(long k, int n, int mod) {
		if (n == 1) {
			return k;
		}

		long t = pow(k, n / 2, mod);
		t = t * t % mod * (n % 2 == 1 ? k : 1) % mod;
		return t;
	}

}
