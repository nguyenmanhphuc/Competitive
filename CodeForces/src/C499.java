import java.util.Hashtable;
import java.util.Scanner;

public class C499 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long xH = in.nextLong();
		long yH = in.nextLong();
		long xU = in.nextLong();
		long yU = in.nextLong();
		int n = in.nextInt();

		int count = 0;
		for (int i = 0; i < n; ++i) {
			long x = in.nextLong();
			long y = in.nextLong();
			long c = in.nextLong();
			if (isA(xH, yH, x, y, c) != isA(xU, yU, x, y, c)) {
				count++;
			}
		}

		System.out.println(count);
	}

	static boolean isA(long x, long y, long a, long b, long c) {
		return a * x + b * y + c > 0;
	}
}
