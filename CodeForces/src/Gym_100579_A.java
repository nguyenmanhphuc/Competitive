import java.util.Arrays;
import java.util.Scanner;

public class Gym_100579_A {
	static int[] primes;
	static Scanner in = new Scanner(System.in);
	static int primesLength;
	static byte[] counts = new byte[10000001];

	public static void main(String[] args) {
		solve();
		int t = in.nextInt();
		StringBuilder str = new StringBuilder();
		for (int cas = 1; cas <= t; ++cas) {
			System.out.print("Case #" + cas + ": ");
			System.out.println(getResult());
		}
	}

	private static int getResult() {
		int a = in.nextInt();
		int b = in.nextInt();
		int k = in.nextInt();

		if (k > 9) {
			return 0;
		}

		int result = 0;
		for (int i = a; i <= b; ++i) {
			if (counts[i] == k) {
				result++;
			}
		}
		return result;
	}

	private static void solve() {

		for (int i = 2; i < 10000000; ++i) {
			if (counts[i] > 0) {
				continue;
			}
			int cur = i;

			while (cur <= 10000000) {
				counts[cur]++;
				cur += i;
			}
		}

	}

}
