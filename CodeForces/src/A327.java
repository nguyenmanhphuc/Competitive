import java.util.Scanner;

public class A327 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		/*
		 * int n = in.nextInt();
		 * 
		 * int sum = 0; int arr[] = new int[n]; for (int i = 0; i < n; ++i) {
		 * arr[i] = in.nextInt(); sum += arr[i]; }
		 * 
		 * int max = 0;
		 * 
		 * for (int i = 0; i < n; ++i) { for (int j = i; j < n; ++j) { int temp
		 * = sum; for (int k = i; k <= j; ++k) { temp += (arr[k] == 0) ? 1 : -1;
		 * } max = Math.max(max, temp); } } System.out.println(max);
		 */
	}

	static void solve(Scanner in) {
		int n = in.nextInt();
		boolean hasZero = false;
		int sum = 0;
		int arr[] = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
			if (arr[i] == 0) {
				hasZero = true;
			}
			sum += arr[i];
		}
		if (!hasZero) {
			System.out.println(n - 1);
			return;
		}

		int max = 1;
		int cur = 0;
		for (int i = 0; i < n; ++i) {
			if (arr[i] == 1) {
				cur--;
				cur = Math.max(0, cur);
			} else {
				cur++;
				max = Math.max(max, cur);
			}
		}
		System.out.println(sum + max);
	}
}
