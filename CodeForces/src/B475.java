import java.awt.Component;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;
import java.util.Stack;

public class B475 {

	static int count = 0;
	static int visited[][];
	static int n;
	static int m;
	static char[] h;
	static char[] v;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		int horizotal[] = new int[n];
		int vertical[] = new int[m];
		h = in.next().toCharArray();
		v = in.next().toCharArray();
		visited = new int[n][m];
		visited[0][0] = 1;
		
		boolean result = dfs(0, 0, 1);
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				if (visited[i][j] == 0) {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println(result ? "YES" : "NO");
	}

	private static boolean dfs(int i, int j, int value) {
		int x = j + GetHorizotal(h[i]);
		visited[i][j] = value++;
		boolean isRoot = true;
		if (x >= 0 && x < m) {
			if (visited[i][x] == 0) {
				boolean result = dfs(i, x, value);
				if (!result) {
					return false;
				}
			}
			if (visited[i][j] > visited[i][x]) {
				visited[i][j] = visited[i][x];
				isRoot = false;
			}
		}
		int y = i + GetVertical(v[j]);
		if (y >= 0 && y < n) {
			if (visited[y][j] == 0) {
				boolean result = dfs(y, j, value);
				if (!result) {
					return false;
				}
			}

			if (visited[i][j] > visited[y][j]) {
				visited[i][j] = visited[y][j];
				isRoot = false;
			}
		}

		if (isRoot && !(i == 0 && j == 0)) {
			return false;
		}
		return true;
	}

	private static int GetHorizotal(char c) {
		return c == '<' ? -1 : 1;
	}

	private static int GetVertical(char c) {
		return c == '^' ? -1 : 1;
	}
}
