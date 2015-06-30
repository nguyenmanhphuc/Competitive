import java.util.Scanner;

public class A343 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();

		System.out.println(gcd(a, b));

	}

	static long gcd(long a, long b) {
		if (a % b == 0) {
			return a / b;
		}
		return a / b + gcd(b,a % b);
	}
}
