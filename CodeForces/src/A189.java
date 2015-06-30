import java.util.Scanner;

public class A189 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int dp[] = new int[n + 2];
		dp[0] = 0;
		for (int i = 1; i <= n; ++i) {
			if (i == a) {
				dp[i] = Math.max(dp[i], 1);
			} else if (i > a && dp[i - a] > 0) {
				dp[i] = Math.max(dp[i], dp[i - a] + 1);
			}

			if (i == b) {
				dp[i] = Math.max(dp[i], 1);
			} else if (i > b && dp[i - b] > 0) {
				dp[i] = Math.max(dp[i], dp[i - b] + 1);
			}

			if (i == c) {
				dp[i] = Math.max(dp[i], 1);
			} else if (i > c && dp[i - c] > 0) {
				dp[i] = Math.max(dp[i], dp[i - c] + 1);
			}
		}
		System.out.println(dp[n]);

	}
}
