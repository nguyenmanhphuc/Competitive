import java.util.Scanner;

public class Fishing {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int t = in.nextInt();
		while (t-- > 0) {
			solve();
		}
	}

	private static void solve() {
		int r = in.nextInt();
		int c = in.nextInt();
		int[][] oversea = new int[r + 1][c + 1];
		for (int i = 1; i <= r; ++i) {
			for (int j = 1; j <= c; ++j) {
				oversea[i][j] = in.nextInt();
			}
		}

		int limit = Math.min(r, c);
		int doubleLimit = limit << 1;
		int[][][] nourish = new int[r + 1][c + 1][doubleLimit + 1];
		
		int[][][] fishing = new int[r + 1][c + 1][limit + 1];
		for (int i = 0; i <= doubleLimit; ++i) {
			for(int j=0; j<=c; ++j){
				nourish[0][j][i] =10000000;
			}
			for(int j=0; j<=r; ++j){
				nourish[j][0][i] =10000000;
			}
		}
		
		for (int i = 1; i <= r; ++i) {
			for (int j = 1; j <= c; ++j) {
				for (int k = 1; k <= doubleLimit; ++k) {
					if (k <= limit) {
						fishing[i][j][k] = Math.max(fishing[i - 1][j][k],
								fishing[i][j - 1][k]);
						fishing[i][j][k] = Math.max(fishing[i][j][k],
								fishing[i - 1][j][k - 1] + oversea[i][j]);
						fishing[i][j][k] = Math.max(fishing[i][j][k],
								fishing[i][j - 1][k - 1] + oversea[i][j]);
					}
					nourish[i][j][k] = Math.min(nourish[i - 1][j][k],
							nourish[i][j - 1][k]);
					nourish[i][j][k] = Math.min(nourish[i][j][k],
							nourish[i - 1][j][k - 1] + oversea[i][j]);
					nourish[i][j][k] = Math.min(nourish[i][j][k],
							nourish[i][j - 1][k - 1] + oversea[i][j]);
				}
			}
		}

		long max = 0;
		for (int i = 1; i <= limit; ++i) {
			max = Math.max(max, fishing[r][c][i] - nourish[r][c][i << 1]);
		}
		
		System.out.println(max);
	}
}
