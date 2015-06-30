import java.util.Scanner;

public class B118 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[][] matrix = new char[2 * n + 1][4 * n + 1];
		for (int i = 0; i <= 2 * n; ++i) {
			for (int j = 0; j <= 4 * n; ++j) {
				int k = i + (j >> 1) - n;
				if (i <= n && j <= 2 * n) {
					matrix[i][j] = (char) (k < 0 || j % 2 == 1 ? (' ')
							: (k + '0'));
				}

				else if (i <= n) {
					matrix[i][j] = matrix[i][4 * n - j];
				} else {
					matrix[i][j] = matrix[2 * n - i][j];
				}
			}
		}
		for (int i = 0; i <= 2 * n; ++i) {
			String s = new String(matrix[i]);
			int k = n << 2;
			while (s.charAt(k) == ' ') {
				k--;
			}
			System.out.println(s.substring(0, k + 1));
		}
	}
}
