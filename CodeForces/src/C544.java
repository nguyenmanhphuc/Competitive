import java.util.Scanner;

public class C544 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int b = in.nextInt();
		int mod = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = in.nextInt();
		}
		long[][][] dp = new long[2][m + 1][b + 1];
		dp[0][0][0] = 1;
		for (int h = 1; h <= n; ++h) {
			int z = h & 1;
			for (int i = 0; i <= m; ++i) {
				for (int j = 0; j <= b; ++j) {
					dp[z][i][j] = dp[z ^ 1][i][j];
					if (i > 0 && j - a[h - 1] >= 0) {
						dp[z][i][j] += dp[z][i - 1][j - a[h - 1]];
					}
					dp[z][i][j] %= mod;
				}
			}
		}
		long answer = 0;
		for (int i = 0; i <= b; ++i) {
			answer += dp[n & 1][m][i];
		}
		System.out.println(answer % mod);

	}
}
