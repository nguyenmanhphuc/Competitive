import java.util.Scanner;

public class A340 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();

		int gcd = gcd(x, y);

		long m = x * y / gcd;
		System.out.println(b / m - (a - 1) / m);
	}

	private static int gcd(int x, int y) {
		return x % y == 0 ? y : gcd(y, x % y);
	}

}
