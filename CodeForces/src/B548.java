import java.util.Scanner;

public class B548 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int q = in.nextInt();
		int[][] bears = new int[n][m];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				bears[i][j] = in.nextInt();
			}
		}

		int maxRow[] = new int[n];
		for (int k = 0; k < n; ++k) {
			int count = 0;
			for (int j = 0; j < m; ++j) {
				if (bears[k][j] == 1) {
					count++;
				} else {
					maxRow[k] = Math.max(maxRow[k], count);
					count = 0;
				}
			}

			maxRow[k] = Math.max(maxRow[k], count);
		}

		for (int i = 0; i < q; ++i) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			bears[a][b] = 1 - bears[a][b];

			int max = 0;

			int count = 0;
			for (int j = 0; j < m; ++j) {
				if (bears[a][j] == 1) {
					count++;
				} else {
					max = Math.max(max, count);
					count = 0;
				}
			}

			max = Math.max(max, count);
			maxRow[a] = max;
			for (int j = 0; j < n; ++j) {
				max = Math.max(max, maxRow[j]);
			}

			System.out.println(max);
		}

	}

}
