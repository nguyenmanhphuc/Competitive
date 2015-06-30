import java.util.Arrays;
import java.util.Scanner;

public class A100694 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int limit =m + 901;
		long[][][] dp = new long[2][3][limit];
		int mod = 0;

		Artifact[] artifacts = new Artifact[n];
		for (int i = 0; i < n; ++i) {
			artifacts[i] = new Artifact(in.nextInt(), in.nextInt(),
					in.nextInt());
		}

		Arrays.sort(artifacts);

		for (int i = 0; i < n; ++i) {
			int preRow = mod;
			mod = mod ^ 1;
			int p = artifacts[i].p;
			int w = artifacts[i].w;
			int d = artifacts[i].d;

			for (int j = 2; j >= 1; --j) {
				for (int k = 0; k < limit; ++k) {
					dp[mod][j][k] = dp[preRow][j][k];

					int t = k + d - w;
					if (t >= limit)
						t = limit - 1;
					if (t >= 0) {
						dp[mod][j][k] = Math.max(dp[mod][j][k],
								dp[preRow][j - 1][t] + p);
					}
					t = k - w;

					if (t >= 0) {
						dp[mod][j][k] = Math.max(dp[mod][j][k],
								dp[preRow][j][t] + p);
					}
					if (k == 0) {
						continue;
					}

					dp[mod][j][k] = Math.max(dp[mod][j][k], dp[mod][j][k - 1]);
				}
			}

			for (int k = 0; k < limit; ++k) {
				dp[mod][0][k] = dp[preRow][0][k];
				int t = k - w;
				if (t < 0) {
					continue;
				}
				dp[mod][0][k] = Math.max(dp[mod][0][k], dp[preRow][0][t] + p);
				if (k > 0) {
					dp[mod][0][k] = Math.max(dp[mod][0][k], dp[mod][0][k - 1]);
				}
			}
		}

		long max = 0;
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j <= m; ++j) {
				max = Math.max(max, dp[mod][i][j]);
			}
		}
		System.out.println(max);
	}

	static class Artifact implements Comparable<Artifact> {
		public int p;
		public int w;
		public int d;

		public Artifact(int p, int w, int d) {

			this.p = p;
			this.w = w;
			this.d = d;
		}

		@Override
		public int compareTo(Artifact a) {
			return Integer.compare(a.w - a.d, w - d);
		}
	}
}
