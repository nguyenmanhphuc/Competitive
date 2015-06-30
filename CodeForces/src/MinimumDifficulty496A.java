import java.util.Scanner;

public class MinimumDifficulty496A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int difficult = Integer.MAX_VALUE;
		int arr[] = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
		}

		int index = -1;
		int result = -1;
		for (int i = 2; i < n; ++i) {
			if (arr[i] - arr[i - 2] < difficult) {
				difficult = arr[i] - arr[i - 2];
				index = i - 1;
			}
		}

		for (int i = 1; i < n; ++i) {
			if (index == i - 1) {
				result = Math.max(arr[i] - arr[i - 2], result);
			} else {
				result = Math.max(arr[i] - arr[i - 1], result);
			}
		}
		System.out.println(result);
	}
}
