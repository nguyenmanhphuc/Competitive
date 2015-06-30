import java.util.Scanner;

public class C540 {
	static char[][] matrix;
	static int r2;
	static int c2;
	static int[][] value;
	static int n;
	static int m;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		matrix = new char[n][];
		for (int i = 0; i < n; ++i) {
			matrix[i] = in.next().toCharArray();
		}
		value = new int[n][m];

		int r1 = in.nextInt() - 1;
		int c1 = in.nextInt() - 1;
		r2 = in.nextInt() - 1;
		c2 = in.nextInt() - 1;
		if (r1 == r2 && c1 == c2) {
			if (r1 > 0 && matrix[r1 - 1][c1] == '.') {
				System.out.println("YES");
				return;
			}
			if (r1 < n - 1 && matrix[r1 + 1][c1] == '.') {
				System.out.println("YES");
				return;
			}

			if (c1 > 0 && matrix[r1][c1 - 1] == '.') {
				System.out.println("YES");
				return;
			}

			if (c1 < m - 1 && matrix[r1][c1 + 1] == '.') {
				System.out.println("YES");
				return;
			}

			System.out.println("NO");
			return;
		}
		boolean check = solve(r1, c1);
		if (check) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	private static boolean solve(int r1, int c1) {
		if (r1 == r2 && c1 == c2 && matrix[r1][c1] == 'X') {
			return true;
		}
		matrix[r1][c1] = 'X';

		if (r1 > 0) {
			if (r1 - 1 == r2 && c1 == c2 && matrix[r1 - 1][c1] == 'X') {
				return true;
			}
			if (matrix[r1 - 1][c1] == '.' && solve(r1 - 1, c1)) {
				return true;
			}
		}

		if (r1 < n - 1) {
			if (r1 + 1 == r2 && c1 == c2 && matrix[r1 + 1][c1] == 'X') {
				return true;
			}
			if (matrix[r1 + 1][c1] == '.' && solve(r1 + 1, c1)) {
				return true;
			}
		}

		if (c1 > 0) {
			if (r1 == r2 && c1 - 1 == c2 && matrix[r1][c1 - 1] == 'X') {
				return true;
			}
			if (matrix[r1][c1 - 1] == '.' && solve(r1, c1 - 1)) {
				return true;
			}
		}

		if (c1 < m - 1) {
			if (r1 == r2 && c1 + 1 == c2 && matrix[r1][c1 + 1] == 'X') {
				return true;
			}
			if (matrix[r1][c1 + 1] == '.' && solve(r1, c1 + 1)) {
				return true;
			}
		}

		return false;
	}
}
