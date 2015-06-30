import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D158 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> factor = new ArrayList<>();
		factor.add(n);
		for (int i = 2; i * i <= n; ++i) {
			if (n % i == 0) {
				factor.add(i);
				if (n / i != i) {
					factor.add(n / i);
				}
			}
		}

		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = in.nextInt();
		}
		long max = Long.MIN_VALUE;
		for (Integer integer : factor) {
			if (integer < 3) {
				continue;
			}
			int k = n / integer;
			long[] sum = new long[k];
			for (int i = 0; i < n; ++i) {
				sum[i % k] += a[i];
			}

			for (int i = 0; i < k; ++i) {
				max = Math.max(max, sum[i]);
			}
		}
		System.out.println(max);
	}
}
