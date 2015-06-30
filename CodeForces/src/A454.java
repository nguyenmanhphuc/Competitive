import java.util.Scanner;

public class A454 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] collisonResult = new int[n + 1][n + 1];
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n; ++j) {
				collisonResult[i][j] = in.nextInt();
			}
		}
		int count = 0;
		StringBuilder str = new StringBuilder();
		for (int i = 1; i <= n; ++i) {
			boolean turn = false;
			for (int j = 1; j <= n; ++j) {
				if (collisonResult[i][j] == 1 || collisonResult[i][j] == 3) {
					turn = true;
					break;
				}
			}
			if (turn) {
				continue;
			}
			for (int j = 1; j <= n; ++j) {
				if (collisonResult[j][i] == 2 || collisonResult[j][i] == 3) {
					turn = true;
					break;
				}
			}
			if (!turn) {
				count++;
				if (count > 1) {
					str.append(' ');

				}
				str.append(i);
			}
		}
		System.out.println(count);
		System.out.println(str);

	}
}
