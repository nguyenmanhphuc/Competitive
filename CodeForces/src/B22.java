import java.util.Scanner;

public class B22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		char arr[][] = new char[n][m];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.next().toCharArray();
		}
		int index[] = new int[m];
		int max = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				if (arr[i][j] == '1') {
					index[j] = i + 1;
				}
			}

			for (int j = 0; j < m; ++j) {
				if (arr[i][j] == '1') {
					continue;
				}
				int min = 0;
				for (int k = j; k >= 0; --k) {
					min = Math.max(min, index[k]);
					int a = Math.abs(k - j + 1);
					int b = (i - min + 1);
					if (b > 0) {
						max = Math.max(max, (a + b) * 2);
					}
				}
				min = index[j];
				for (int k = j + 1; k < m; ++k) {
					min = Math.max(min, index[k]);
					int a = Math.abs(k - j + 1);
					int b = (i - min + 1);
					if (b > 0) {
						max = Math.max(max, (a + b) * 2);
					}
				}

			}
		}

		System.out.println(max-1);

	}
}
