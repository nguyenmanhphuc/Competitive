import java.util.Scanner;

public class B116 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		char[][] grid = new char[n][];
		for (int i = 0; i < n; ++i) {
			grid[i] = in.next().toCharArray();
		}

		int count = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				if (grid[i][j] != 'W') {
					continue;
				}

				if (i > 0 && grid[i - 1][j] == 'P') {
					count++;
				} else if (j > 0 && grid[i][j - 1] == 'P') {
					count++;
				} else if (j < m - 1 && grid[i][j + 1] == 'P') {
					count++;
				} else if (i < n - 1 && grid[i + 1][j] == 'P') {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
