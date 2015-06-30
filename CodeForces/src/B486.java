import java.util.Arrays;
import java.util.Scanner;

public class B486 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int col[] = new int[n];
		int row[] = new int[m];
		Arrays.fill(col, 1);
		Arrays.fill(row, 1);

		int B[][] = new int[m][n];
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				int temp = in.nextInt();
				if (temp == 0) {
					row[i] = 0;
					col[j] = 0;
				}
				B[i][j] = temp;
			}
		}

		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				if (B[i][j] != (col[j] | row[i])) {
					System.out.println("NO");
					return;
				}
			}
		}

		int[][] A = new int[m][n];
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				A[i][j] = 1;
			}
		}

		for (int i = 0; i < m; ++i) {
			if (row[i] == 0) {
				for (int j = 0; j < n; ++j) {
					A[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < n; ++i) {
			if (col[i] == 0) {
				for (int j = 0; j < m; ++j) {
					A[j][i] = 0;
				}
			}
		}

		int colTemp[] = new int[n];
		int rowTemp[] = new int[m];

		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				colTemp[j] |= A[i][j];
				rowTemp[i] |= A[i][j];
			}
		}

		for (int i = 0; i < m; ++i) {
			if (rowTemp[i] != row[i]) {
				System.out.println("NO");
				return;
			}
		}
		for (int j = 0; j < n; ++j) {
			if (col[j] != colTemp[j]) {
				System.out.println("NO");
				return;
			}
		}

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				stringBuilder.append(A[i][j]);
				if (j != n - 1) {
					stringBuilder.append(" ");
				}
			}
			stringBuilder.append("\n");
		}
		System.out.println("YES");
		System.out.print(stringBuilder);
	}
}
