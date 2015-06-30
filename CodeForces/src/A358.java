import java.util.Scanner;

public class A358 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x[] = new int[n];
		for (int i = 0; i < n; ++i) {
			x[i] = in.nextInt();
		}

		for (int i = 2; i < n; ++i) {
			int min = Math.min(x[i], x[i - 1]);
			int max = Math.max(x[i], x[i - 1]);
			for (int j = i - 2; j > 0; --j) {
				int t = Math.min(x[j], x[j - 1]);
				int a = Math.max(x[j], x[j - 1]);
				if (max > a && min > t && min < a) {
					System.out.println("yes");
					return;
				} else if (max < a && min < t && t < max) {
					System.out.println("yes");
					return;
				}
			}
		}
		System.out.println("no");

	}

}
