import java.util.Scanner;

public class A488 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long n = in.nextLong();
		long above = 0;
		for (above = n + 1; n <= 8888888888l; ++above) {
			if (check(Math.abs(above))) {
				break;
			}
		}
		System.out.println(above-n);
	}

	static boolean check(long b) {
		while (b > 0) {
			long k = b % 10;
			if (k == 8) {
				return true;

			}
			b /= 10;
		}
		return false;
	}

}
