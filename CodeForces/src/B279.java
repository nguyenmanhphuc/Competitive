import java.util.Scanner;

public class B279 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int time[] = new int[n];
		int total[] = new int[n + 1];
		for (int i = 0; i < n; ++i) {
			time[i] = in.nextInt();
			total[i + 1] = total[i] + time[i];
		}
		int max = 0;
		for (int i = 0; i < n; ++i) {
			if (total[i + 1] <= t) {
				max = i + 1;
			} else {
				int left = total[i + 1] - t - 1;
				int index = lowerBound(total, left);
				max = Math.max(i - index, max);

			}
		}
		System.out.println(max);

	}

	public static int lowerBound(int[] arr, int value) {
		int right = arr.length - 1;
		int left = 0;
		if (arr[0] > value) {
			return -1;
		}

		while (right != left) {
			int mid = (right + left + 1) >> 1;
			if (arr[mid] <= value) {
				left = mid;
			} else {
				right = mid - 1;
			}
		}

		if (arr[left] <= value) {
			return left;
		}
		return left - 1;
	}
}
