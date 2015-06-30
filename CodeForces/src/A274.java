import java.util.Arrays;
import java.util.Scanner;

public class A274 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr);
		int count = 0;
		int choose[] = new int[n];
		for (int i = n - 1; i >= 0; --i) {
			if (choose[i] != 0) {
				continue;
			}

			if (arr[i] % k == 0) {
				int t = arr[i] / k;
				int index = Arrays.binarySearch(arr, t);
				if (index >= 0) {
					choose[index] = -1;
				}
			}
			count++;
		}
		System.out.println(count);
	}
}
