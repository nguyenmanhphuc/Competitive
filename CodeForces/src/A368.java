import java.util.Arrays;
import java.util.Scanner;

public class A368 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] hooks = new int[n];
		int sum = 0;
		for (int i = 0; i < n; ++i) {
			hooks[i] = in.nextInt();
			sum += hooks[i];
		}
		int m = in.nextInt();
		Arrays.sort(hooks);

		if (m >= n) {
			System.out.println(sum - (m - n) * d);
			return;
		}

		for (int i = n - 1; i >= m; --i) {
			sum -= hooks[i];
		}
		System.out.println(sum);
	}
}
