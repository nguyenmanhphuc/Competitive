import java.util.Scanner;

public class A508A {
	static boolean table[][];
	static int n;
	static int m;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		table = new boolean[n + 1][m + 1];
		int k = in.nextInt();
		for (int i = 1; i <= k; ++i) {
			int r = in.nextInt();
			int c = in.nextInt();

			if (repaint(r, c)) {
				System.out.println(i);
				return;
			}
			
		}
		System.out.println(0);
	}

	private static boolean repaint(int r, int c) {

		table[r][c] = true;

		if (r > 1 && c > 1 && table[r][c - 1] && table[r - 1][c - 1]
				&& table[r - 1][c]) {
			return true;
		}

		if (r > 1 && c < m && table[r][c + 1] && table[r - 1][c + 1]
				&& table[r - 1][c]) {
			return true;
		}
		if (r < n && c < m && table[r][c + 1] && table[r + 1][c + 1]
				&& table[r + 1][c]) {
			return true;
		}

		if (r < n && c > 1 && table[r][c - 1] && table[r + 1][c - 1]
				&& table[r + 1][c]) {
			return true;
		}
		return false;
	}
}
