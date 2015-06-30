import java.util.Scanner;

public class Gym_100579_B {

	static long a[][] = new long[2001][2001];
	static long b[][] = new long[2001][2001];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		initA();
		initB();
		int n = in.nextInt();
		for (int i = 1; i <= n; ++i) {
			String s = in.next();
			String[] groups = s.split("-");

			int x = Integer.parseInt(groups[0]);
			int y = Integer.parseInt(groups[1]);

			System.out.println("Case #" + i + ": " + a[x][y] + " " + b[y][y]);
		}
	}

	static void initA() {
		for (int i = 1; i <= 2000; ++i) {
			a[i][0] = 1;
		}

		for (int i = 1; i <= 2000; ++i) {
			for (int j = 1; j < i; ++j) {
				if (i > j + 1) {
					a[i][j] = a[i][j - 1] + a[i - 1][j];
				} else {
					a[i][j] = a[i][j - 1];
				}
				a[i][j] %= 1000000007;
			}
		}
	}

	static void initB() {
		for (int i = 0; i <= 2000; ++i) {
			b[0][i] = 1;
		}

		for (int i = 1; i <= 2000; ++i) {
			for (int j = 1; j <= i; ++j) {
				if (i == j) {
					b[j][i] = b[j - 1][i];
				} else {
					b[j][i] = b[j - 1][i] + b[j][i - 1];
				}
				b[j][i] %= 1000000007;
			}
		}
	}

}
