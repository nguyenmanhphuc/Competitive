import java.util.Scanner;

public class A222 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int value = 0;
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			int t = in.nextInt();
			arr[i] = t;
			if (i == k) {
				value = t;
			} else if (i > k && t != value) {
				System.out.println("-1");
				return;
			}
		}
		for (int i = k - 1; i > 0; --i) {
			if (arr[i] != value) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);

	}
}
