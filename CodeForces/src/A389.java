import java.util.Scanner;

public class A389 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int gcd = in.nextInt();
		for (int i = 1; i < n; ++i) {
			gcd = gcd(gcd, in.nextInt());
		}
		System.out.println(gcd * n);
	}

	private static int gcd(int a, int b) {

		return a % b == 0 ? b : gcd(b, a % b);
	}

}
