import java.util.Scanner;

public class B14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int x0 = in.nextInt();
		int pos[] = new int[1001];
		for (int i = 0; i < n; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			int left = Math.min(a, b);
			int right = Math.max(a, b);
			for (int j = left; j <= right; ++j) {
				pos[j]++;
			}

		}

		int min = 10000;
		for (int i = 0; i < 1000; ++i) {
			if (pos[i] == n) {
				min = Math.min(min, Math.abs(i - x0));
			}
		}

		System.out.println(min == 10000 ? -1 : min);

	}
}
