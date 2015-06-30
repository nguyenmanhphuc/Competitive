import java.util.Scanner;

public class I100187 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int b[] = new int[n];
		for (int i = 0; i < n; ++i) {
			b[i] = in.nextInt();
		}

		long cons = 1000000000;
		long[] a = new long[n + 1];
		int index = 1;
		a[1] = 1;
		for (int i = n - 2; i >= 0; --i) {
			index++;
			if (b[i] == 0) {

				long t = Long.MIN_VALUE;
				for (int j = 1; j < index; ++j) {
					t = Math.max(t, a[j]);
				}

				t = t - (-1);

				for (int j = 1; j < index; ++j) {
					a[j] -= t;
					if (Math.abs(a[j]) > cons) {
						System.out.println("IMPOSSIBLE");
						return;
					}
				}

				a[index] = 1;
				for (int j = index - 1; j >= 1; --j) {
					a[j] = a[j + 1] - a[j];
				}

			} else {
				long t = Long.MAX_VALUE;
				for (int j = 1; j < index; ++j) {
					t = Math.min(t, a[j]);
				}

				t = 1 - t;

				for (int j = 1; j < index; ++j) {
					a[j] += t;
					if (Math.abs(a[j]) > cons) {
						System.out.println("IMPOSSIBLE");
						return;
					}
				}
				long k = 1;

				for (int j = 1; j <= index; ++j) {
					long z = a[j] + k;
					a[j] = k;
					k = z;
				}
			}
			long min = Long.MAX_VALUE;
			for (int j = 1; j <= index; ++j) {
				min = Math.min(min, a[j]);
			}
			long change = min - (-cons);
			for (int j = 1; j <= index; ++j) {
				a[j] -= change;
				if (Math.abs(a[j]) > cons) {
					System.out.println("IMPOSSIBLE");
					return;
				}
			}

		}

		for (int i = 1; i <= n; ++i) {
			if (i > 1) {
				System.out.print(" ");
			}
			System.out.print(a[i]);

		}
		System.out.println();
	}
}
