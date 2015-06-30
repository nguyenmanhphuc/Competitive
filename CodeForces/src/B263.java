import java.util.Arrays;
import java.util.Scanner;

public class B263 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = in.nextInt();
		}

		Arrays.sort(a);

		if (k > n) {
			System.out.println(-1);
			return;
		}

		int left = n - k;
		System.out.println(a[left] + " 0");
	}
}
