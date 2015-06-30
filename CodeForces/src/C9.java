import java.util.Scanner;

public class C9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		solve(n);
		// solve(200);
		/*
		 * for (int i = 1; i < 100; ++i) { System.out.print(i + " "); solve(i);
		 * }
		 */
	}

	static void solve(int n) {
		int arr[] = new int[10];
		int i = 0;
		while (n > 0) {
			arr[i++] = n % 10;
			n /= 10;
		}
		int c = i;
		int result = 0;
		boolean check = false;

		if (arr[c - 1] > 1) {
			System.out.println((1 << c) - 1);
			return;
		}

		for (i = c - 1; i >= 0; --i) {
			if (arr[i] > 1) {
				result += 1 << (i + 1);
				break;
			}

			if (arr[i] == 0) {
				if (i == 0) {
					result++;
				}
				continue;
			}

			if (i == 0) {
				result += c == 1 ? 1 : 2;
			} else {
				result += (1 << i) - ((i == c - 1) ? 1 : 0);
			}

		}
		System.out.println(result);
	}
}
