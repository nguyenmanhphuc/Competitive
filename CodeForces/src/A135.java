import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class A135 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);

		PrintWriter writer = new PrintWriter(System.out);
		int pre = 0;
		for (int i = 0; i < n; ++i) {
			if (i > 0) {
				writer.print(' ');
			}
			if (arr[i] == 1) {

				if (i + 1 < n && arr[i + 1] == arr[i]) {
					pre = Math.max(pre, 1);
				} else if (i + 1 < n) {
					pre = Math.max(pre, 1);
				} else {
					pre = Math.max(pre, 2);
				}
			} else {
				if (i == 0) {
					pre = 1;

				} else {
					pre = Math.max(arr[i - 1], pre);
				}
			}
			writer.print(pre);
		}
		writer.close();
	}
}
