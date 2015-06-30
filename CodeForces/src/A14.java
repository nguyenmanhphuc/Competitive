import java.util.Scanner;

public class A14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		char arr[][] = new char[n][m];

		int bottom = 0;
		int up = n - 1;
		int left = m - 1;
		int right = 0;

		for (int i = 0; i < n; ++i) {
			arr[i] = in.next().toCharArray();

			for (int j = 0; j < m; ++j) {
				if (arr[i][j] != '*') {
					continue;
				}

				up = Math.min(up, i);
				bottom = Math.max(bottom, i);
				left = Math.min(left, j);
				right = Math.max(right, j);
			}
		}

		StringBuilder str = new StringBuilder();
		/*
		 * str.append((bottom - up + 1)); str.append(' '); str.append((right -
		 * left + 1));
		 * 
		 * str.append("\n");
		 */
		for (int i = up; i <= bottom; ++i) {
			for (int j = left; j <= right; ++j) {
				str.append(arr[i][j]);
			}
			str.append('\n');
		}
		System.out.print(str);
	}
}
