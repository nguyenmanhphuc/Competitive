import java.util.Scanner;

public class B510 {
	static int n;
	static int m;
	static char[][] boards;
	static boolean[][] visited;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		boards = new char[n][];
		visited = new boolean[n][m];
		for (int i = 0; i < n; ++i) {
			boards[i] = in.next().toCharArray();
		}

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				if (!visited[i][j]) {
					if (dfs(i, j, -1, -1)) {
						System.out.println("Yes");
						return;
					}
				}
			}
		}
		System.out.println("No");

	}

	private static boolean dfs(int i, int j, int preI, int preJ) {
		if (visited[i][j])
			return true;
		visited[i][j] = true;
		if (i > 0 && !(i - 1 == preI && preJ == j)
				&& boards[i - 1][j] == boards[i][j]) {

			if (dfs(i - 1, j, i, j)) {
				return true;
			}
		}

		if (i + 1 < n && !(i + 1 == preI && preJ == j)
				&& boards[i + 1][j] == boards[i][j]) {
			if (dfs(i + 1, j, i, j)) {
				return true;
			}
		}

		if (j > 0 && !(i == preI && preJ == j - 1)
				&& boards[i][j - 1] == boards[i][j]) {
			if (dfs(i, j - 1, i, j)) {
				return true;
			}
		}

		if (j + 1 < m && !(i == preI && preJ == j + 1)
				&& boards[i][j + 1] == boards[i][j]) {
			if (dfs(i, j + 1, i, j)) {
				return true;
			}
		}

		return false;
	}
}
