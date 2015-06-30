import java.util.Scanner;

class HorrorDash11799 {

	public void solve() {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 1; i <= t; ++i) {
			int n = in.nextInt();
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < n; ++j) {
				max = Math.max(max, in.nextInt());
			}
			System.out.println("Case " + i + ": " + max);
		}

	}

}
