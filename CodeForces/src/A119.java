import java.util.Scanner;

public class A119 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int n = in.nextInt();
		while (n > 0) {
			int gcd = gcd(n, a);
			if (gcd > n) {
				System.out.println(1);
				return;
			}
			n -= gcd;
			gcd = gcd(n, b);
			if (gcd > n) {
				System.out.println(0);
				return;
			}
			n -= gcd;
		}
		System.out.println(1);
	}

	static int gcd(int a, int b) {
		return a % b == 0 ? b : gcd(b, a % b);
	}

}
