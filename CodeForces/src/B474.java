import java.util.Scanner;

public class B474 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] arr = new int[n + 1];
		arr[0] = 1;

		for (int i = 1; i <= n; ++i) {
			arr[i] = arr[i - 1] + in.nextInt();
		}
		int k = in.nextInt();
		for (int i = 0; i < k; ++i) {
			System.out.println(lowerBoundIndex(arr, in.nextInt()) + 1);
		}
	}

	public static int lowerBoundIndex(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		if (arr[left] > key || arr[right] < key) {
			return -1;
		}

		while (left < right) {
			int mid = (left + right + 1) >> 1;
			if (arr[mid] <= key) {
				left = mid;
			} else {
				right = mid - 1;
			}
		}

		return left;
	}
}
