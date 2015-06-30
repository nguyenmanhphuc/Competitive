import java.util.Scanner;

public class GigaTower488A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		for (int i = 1; true; ++i) {
			if (check(i + n)) {
				System.out.println(i);
				return;
			}
		}
	}

	private static boolean check(long l) {
		l = Math.abs(l);
		while (l > 0) {
			long z = l % 10;
			if (z == 8) {
				return true;
			}
			l /= 10;
		}
		return false;
	}
}
