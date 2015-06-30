import java.io.PrintWriter;
import java.util.Scanner;

public class A377 {
	static int n;
	static int m;
	static char maze[][];
	static int k;
	static int[] horizontal = new int[] { 0, 1, 0, -1 };
	static int[] vertical = new int[] { -1, 0, 1, 0 };
	static boolean[][] visited;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		k = in.nextInt();
		maze = new char[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < n; ++i) {
			maze[i] = in.next().toCharArray();
		}
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				if (maze[i][j] == '.') {
					dfs(i, j);
					for (int a = 0; a < n; ++a) {
						for (int b = 0; b < m; ++b) {
							writer.print(maze[a][b]);
						}
						writer.println();
					}
					writer.close();
					return;
				}
			}
		}

		for (int a = 0; a < n; ++a) {
			for (int b = 0; b < m; ++b) {
				writer.print(maze[a][b]);
			}
			writer.println();
		}
		writer.close();
		return;

	}

	private static void dfs(int i, int j) {
		visited[i][j] = true;
		for (int z = 0; z < 4; ++z) {
			if (i + vertical[z] >= 0 && i + vertical[z] < n
					&& j + horizontal[z] >= 0 && j + horizontal[z] < m) {

				if (maze[i + vertical[z]][j + horizontal[z]] == '.'
						&& !visited[i + vertical[z]][j + horizontal[z]]) {
					dfs(i + vertical[z], j + horizontal[z]);
					if (k <= 0) {
						return;
					}
				}
			}
		}

		if (k > 0) {
			maze[i][j] = 'X';
			k--;
		}
	}
}
