import java.util.Scanner;

public class P151PROE {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; ++i) {
			long m = in.nextLong();
			long n = in.nextLong();
			long x1 = in.nextLong();

			long y1 = in.nextLong();
			long x2 = in.nextLong();
			long y2 = in.nextLong();

			solve(m, n, x1, y1, x2, y2);
		}

	}

	private static void solve(long m, long n, long x1, long y1, long x2, long y2) {
		if (y1 >= y2) {
			if (x1 > x2) {
				long minx1 = x1 - (x2 - 1);
				long miny1 = y1 - (y2 - 1);
				long maxx2 = x2 + (m - x1);
				long maxy2 = y2 + (n - y1);
				long sum = (m - minx1 + 1) * (n - miny1 + 1) + (maxx2) * maxy2;
				sum -= (maxx2 - minx1 + 1 < 0 ? 0 : maxx2 - minx1 + 1)
						* (maxy2 - miny1 + 1 < 0 ? 0 : maxy2 - miny1 + 1);
			
				System.out.println(m * n - sum);
			} else {
				long maxx1 = x1 + (m - x2);
				long miny1 = y1 - (y2 - 1);
				long minx2 = x2 - (x1 - 1);
				long maxy2 = y2 + (n - y1);
				long sum = (maxx1) * (n - miny1 + 1) + (m - minx2 +1) * maxy2;
				sum -= (maxx1 - minx2 + 1 < 0 ? 0 : maxx1 - minx2 + 1)
						* (maxy2 - miny1 + 1 < 0 ? 0 : maxy2 - miny1 + 1);
				System.out.println(m * n - sum);
			}
		} else {
			solve(m, n, x2, y2, x1, y1);
		}
	}

}
