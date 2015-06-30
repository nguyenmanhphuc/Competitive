import java.util.Scanner;

public class A508 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		int k = in.nextInt();

		boolean[][] arr = new boolean[n + 2][m + 2];

		for (int i = 1; i <= k; ++i) {
			int x = in.nextInt();
			int y = in.nextInt();
			arr[x][y] = true;
			if (arr[x + 1][y] && arr[x + 1][y + 1] && arr[x][y + 1]) {
				System.out.println(i);
				return;
			}
			if (arr[x + 1][y - 1] && arr[x + 1][y] && arr[x][y - 1]) {
				System.out.println(i);
				return;
			}

			if (arr[x][y - 1] && arr[x - 1][y - 1] && arr[x - 1][y]) {
				System.out.println(i);
				return;
			}
			

			if (arr[x][y + 1] && arr[x - 1][y + 1] && arr[x - 1][y]) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
		return;
	}

}
