import java.util.Scanner;

public class C466 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] arr = new long[n + 1];
		for (int i = 1; i <= n; ++i) {
			arr[i] = arr[i - 1] + in.nextLong();
		}

		if (arr[n] == 0) {
			long count = 0;
			for (int i = 1; i < n; ++i) {
				if (arr[i] == 0) {
					count++;
				}
			}
			System.out.println(count * (count - 1) / 2);
		} else if (arr[n] % 3 != 0) {
			System.out.println(0);

		} else {
			long t = arr[n] / 3;
			long result = 0;
			long first = 0;
			for (int i = 0; i < n; ++i) {
				if (arr[i] == t) {
					first++;
				} else if (arr[i] == (t << 1)) {
					result += first;
				}
			}
			System.out.println(result);
		}
	}
}
