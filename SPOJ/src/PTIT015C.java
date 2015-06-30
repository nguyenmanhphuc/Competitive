import java.util.Arrays;
import java.util.Scanner;

public class PTIT015C {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int n = in.nextInt();
		for (int i = 0; i < n; ++i) {
			solve();
		}

	}

	private static void solve() {
		int nTeam = in.nextInt();
		int countOdd = 0;
		Integer[] cs = new Integer[nTeam];
		int sum = 0;
		int countPos = 0;
		for (int i = 0; i < nTeam; ++i) {
			int temp = in.nextInt();
			cs[i] = temp;
			if (temp % 2 == 1) {
				countOdd++;
			}
			sum += temp;
			if (temp > 0) {
				countPos++;
			}
		}
		Arrays.sort(cs);
		int max = cs[nTeam - 1] + cs[nTeam - 2] - 2;
		if ((countPos - 2) * 2 >= max
				&& max <= sum - cs[nTeam - 1] - cs[nTeam - 2]) {
			System.out.println(countOdd % 2 == 0 ? "YES" : "NO");
		} else {
			System.out.println("NO");
		}

	}
}
