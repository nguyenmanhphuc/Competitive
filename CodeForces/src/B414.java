import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class B414 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		List<Integer>[] factors = new List[n + 1];
		for (int i = 1; i <= n; ++i) {
			factors[i] = new ArrayList<>();
			factors[i].add(1);
		}
		int MOD = (int) (1e9 + 7);
		for (int i = 2; i <= n; ++i) {
			for (int j = i; j <= n; j += i) {
				factors[j].add(i);
			}
		}
		long[][] matrix = new long[2][n + 1];
		for (int i = 1; i <= n; ++i) {
			matrix[0][i] = 1;
		}

		int curRow = 0;
		for (int i = 1; i < k; ++i) {
			int nextRow = curRow ^ 1;
			Arrays.fill(matrix[nextRow], 0);
			for (int j = 1; j <= n; ++j) {
				for (Integer factor : factors[j]) {
					matrix[nextRow][j] += matrix[curRow][factor];
				}
				matrix[nextRow][j] %= MOD;
			}
			curRow = nextRow;
		}
		long total = 0;
		for (int i = 1; i <= n; ++i) {
			total += matrix[curRow][i];
		}
		System.out.println(total % MOD);
	}

}
