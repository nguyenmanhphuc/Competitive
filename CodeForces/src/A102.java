import java.util.Scanner;

public class A102 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int values[] = new int[n + 1];
		int m = in.nextInt();

		boolean[][] matched = new boolean[n + 1][n + 1];

		for (int i = 1; i <= n; ++i) {
			values[i] = in.nextInt();
		}

		for (int i = 0; i < m; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			matched[a][b] = true;
			matched[b][a] = true;
		}

		long min = -1;
		for (int i = 1; i <= n; ++i) {
			for (int j = i + 1; j <= n; ++j) {
				for (int k = j + 1; k <= n; ++k) {
					if (matched[i][j] && matched[i][k] && matched[k][j]) {
						int sum = values[i] + values[j] + values[k];
						if (min == -1) {
							min = sum;
						} else if (sum < min) {
							min = sum;
						}
					}
				}
			}
		}
		
		System.out.println(min);

	}

}
