import java.util.Scanner;

public class C496 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		char[][] matrix = new char[n][];
		for (int i = 0; i < n; ++i) {
			matrix[i] = in.next().toCharArray();
		}

		int count = 0;
		boolean[] trictlySmaller = new boolean[n];
		trictlySmaller[n - 1] = true;
		for (int i = 0; i < m; ++i) {
			boolean canUsed = true;
			for (int j = 0; j < n - 1; ++j) {
				if (!trictlySmaller[j] && matrix[j][i] > matrix[j + 1][i]) {
					canUsed = false;
					break;

				}
			}
			if (!canUsed) {
				continue;
			}
			count++;
			for (int j = 0; j < n - 1; ++j) {
				if (!trictlySmaller[j] && matrix[j][i] < matrix[j + 1][i]) {
					trictlySmaller[j] = true;
				}
			}

		}
		System.out.println(m - count);
	}
}
