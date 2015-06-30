import java.util.Scanner;

public class A400 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int t = in.nextInt();
		for (int i = 0; i < t; ++i) {
			solve();
		}
	}

	private static void solve() {
		char[] cards = in.next().toCharArray();
		int count = 0;
		StringBuilder str = new StringBuilder();
		for (int i = 1; i <= 12; ++i) {
			if (12 % i != 0) {
				continue;
			}

			int b = 12 / i;
			int[] cols = new int[b];
			for (int j = 0; j < cards.length; j++) {
				if (cards[j] == 'X') {
					cols[j % b]++;
				}
			}

			for (int j = 0; j < b; ++j) {
				if (cols[j] == i) {
					count++;
					str.append(" " + i + "x" + (b));
					break;
				}
			}
		}
		System.out.print(count);
		if (count > 0) {
			System.out.println(str);
		} else {
			System.out.println();
		}

	}
}
