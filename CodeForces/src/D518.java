import java.util.Scanner;

public class D518 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double p = in.nextDouble();
		int t = in.nextInt();
		double dp[][] = new double[t + 1][n + 1];

		dp[0][0] = 1;
		for (int i = 1; i <= t; ++i) {
			int min = Math.min(t, n);
			for (int j = min; j > 0; --j) {
				dp[i][j] = dp[i - 1][j - 1] * p + dp[i - 1][j]
						* (j >= n ? 1 : (1-p));
			}
			dp[i][0] = dp[i - 1][0] * (1 - p);
		}
		double result = 0;
		for (int i = 0; i <= Math.min(t, n); ++i) {
			result += i * dp[t][i];
		}
		System.out.println(result);

	}
}
