import java.util.Scanner;

public class A509 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long arr[][] = new long[n + 1][n + 1];

		arr[0][1] = 1;
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n; ++j) {
				arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
			}
		}
		System.out.println(arr[n][n]);

	}
}
