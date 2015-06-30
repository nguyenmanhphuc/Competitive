import java.util.Scanner;

public class A359 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				int t = in.nextInt();
				if (t == 0) {
					continue;
				}
				if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
					System.out.println(2);
					return;
				}
			}
		}
		System.out.println(4);

	}

}
