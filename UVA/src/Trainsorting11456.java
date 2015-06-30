import java.util.Scanner;

public class Trainsorting11456 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int t = in.nextInt();
		for (int i = 0; i < t; ++i) {
			solve();
		}
	}

	private static void solve() {
		int n = in.nextInt();
		if (n == 0) {

			System.out.println(n);
			return;
		}
		long ans = 0;
		int arr[] = new int[n];
		int weights[] = new int[n];
		for (int i = 0; i < n; ++i) {
			weights[i] = in.nextInt();
		}

		int more[] = new int[n];
		int fewer[] = new int[n];

		for (int i = n - 1; i >= 0; --i) {
			more[i] = 1;
			fewer[i] = 1;
			for (int j = n - 1; j > i; --j) {
				if (weights[i] > weights[j]) {
					more[i] = Math.max(more[j] + 1, more[i]);
				} else {
					fewer[i] = Math.max(fewer[j] + 1, fewer[i]);
				}
			}
			ans = Math.max(ans, more[i] + fewer[i] - 1);
		}
		System.out.println(ans);
	}
}
