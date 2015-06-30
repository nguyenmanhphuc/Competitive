import java.util.Scanner;

public class C447 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
		}

		int start = 0;
		int i = 0;
		for (i = 1; i < n; ++i) {
			if (arr[i] <= arr[i - 1]) {
				break;
			}
		}
		if (i == n) {
			System.out.println(n);
			return;
		}
		int start2 = i;
		long max = 1;
		for (i = i + 1; i < n; ++i) {
			if (arr[i] <= arr[i - 1]) {
				if (start2 == n - 1 || arr[start2 + 1] - arr[start2 - 1] > 1
						|| start2 == 1 || arr[start2] - arr[start2 - 2] > 1) {
					max = Math.max(max, i - start);
				} else {
					max = Math.max(i - start2 + 1, max);
					max = Math.max(max, start2 - start + 1);
				}
				start = start2;
				start2 = i;
			}
		}

		if (start2 == n - 1 || arr[start2 + 1] - arr[start2 - 1] > 1
				|| start2 == 1 || arr[start2] - arr[start2 - 2] > 1) {
			max = Math.max(max, i - start);
		} else {
			max = Math.max(i - start2 + 1, max);
			max = Math.max(max, start2 - start + 1);
		}
		max = Math.min(max, n);
		System.out.println(max);

	}
}
