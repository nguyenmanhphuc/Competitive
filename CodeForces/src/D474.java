import java.io.PrintWriter;
import java.util.Scanner;

public class D474 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		long dp[] = new long[100001];
		int MOD = (int) (1e9 + 7);
		dp[0] = 1;
		for (int i = 1; i < 100001; ++i) {
			dp[i] = dp[i - 1];
			if (i - k >= 0) {
				dp[i] += dp[i - k];
			}
			dp[i] %= MOD;
		}

		long cur[] = new long[100001];
		for (int i = 1; i < 100001; ++i) {
			cur[i] = (cur[i - 1] + dp[i]);
		}
		PrintWriter writer = new PrintWriter(System.out);

		for (int i = 0; i < n; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			long result = (cur[b] - cur[a - 1]);
			writer.println(result % MOD);
		}
		writer.close();
	}
}
