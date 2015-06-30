import java.util.Scanner;

public class B515 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		boolean boys[] = new boolean[n];
		boolean girls[] = new boolean[m];
		int k = in.nextInt();
		int gcd = gcd(n, m);
		for (int i = 0; i < k; ++i) {
			int z = in.nextInt();
			boys[z] = true;

			for (int j = 0; j < n; ++j) {
				boys[j] = boys[j] || Math.abs(z - j) % gcd == 0;
			}

			for (int j = 0; j < m; ++j) {
				girls[j] = girls[j] || Math.abs(z - j) % gcd == 0;
			}

		}

		k = in.nextInt();
		for (int i = 0; i < k; ++i) {
			int z = in.nextInt();
			girls[z] = true;

			for (int j = 0; j < n; ++j) {
				boys[j] = boys[j] || Math.abs(z - j) % gcd == 0;
			}

			for (int j = 0; j < m; ++j) {
				girls[j] = girls[j] || Math.abs(z - j) % gcd == 0;
			}

		}

		boolean all = true;
		for (int i = 1; i < n; ++i) {
			all = all && boys[i];
		}

		for (int i = 1; i < m; ++i) {
			all = all && girls[i];
		}

		System.out.println(all ? "Yes" : "No");
	}

	static int gcd(int a, int b) {
		while (a % b > 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return b;
	}

}
