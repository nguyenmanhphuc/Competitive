import java.util.Scanner;

public class C467 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		long[] value = new long[n];
		for (int i = 0; i < n; ++i) {
			value[i] = in.nextLong();
		}

		for (int i = 1; i < n; ++i) {
			value[i] += value[i - 1];
		}

		long dp[][] = new long[m][k + 1];
		dp[m - 1][1] = value[m - 1];
		for (int i = m; i < n; ++i) {
			int index = i % m;
			int pre = (i - 1) % m;
			for (int j = k; j > 0; --j) {
				dp[index][j] = Math.max(dp[pre][j], dp[index][j - 1] + value[i]
						- value[i - m]);
			}
		}
		System.out.println(dp[(n - 1) % m][k]);
	}

}
