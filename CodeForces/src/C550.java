import java.util.Scanner;

public class C550 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] n = in.next().toCharArray();
		boolean[][] dp = new boolean[n.length + 1][8];

		for (int i = 0; i < n.length; ++i) {
			if (n[i] == '0') {
				System.out.println("YES\n0");
				return;
			}

			for (int j = i + 1; j < n.length; ++j) {

				if (n[j] == '0') {
					System.out.println("YES\n0");
					return;
				}

				for (int k = j + 1; k < n.length; ++k) {
					if (n[k] == '0') {
						System.out.println("YES\n0");
						return;
					}

					int number = (n[i] - '0') * 100 + (n[j] - '0') * 10
							+ (n[k] - '0');
					if (number % 8 == 0) {
						System.out.println("YES\n" + number);
						return;
					}
				}
			}
		}

		for (int i = 0; i < n.length; ++i) {
			if (n[i] == '0') {
				System.out.println("YES\n0");
				return;
			}

			for (int j = i + 1; j < n.length; ++j) {

				if (n[j] == '0') {
					System.out.println("YES\n0");
					return;
				}

				int number = (n[i] - '0') * 10 + (n[j] - '0');

				if (number % 8 == 0) {
					System.out.println("YES\n" + number);
					return;
				}

			}
		}

		for (int i = 0; i < n.length; ++i) {
			if (n[i] == '0' || n[i] == '8') {
				System.out.println("YES\n" + n[i]);
				return;
			}

		}

		System.out.println("NO");
	}
}
