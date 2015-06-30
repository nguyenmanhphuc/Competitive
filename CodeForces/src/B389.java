import java.util.Scanner;

public class B389 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[][] board = new char[n][];
		for (int i = 0; i < n; ++i) {
			board[i] = in.next().toCharArray();
		}

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (board[i][j] != '#') {
					continue;
				}
				if (j == 0 || j == n - 1 || i >= n - 2) {
					System.out.println("NO");
					return;
				}
				if (board[i + 1][j] != '#') {
					System.out.println("NO");
					return;
				} else {
					board[i + 1][j] = '.';
				}
				if (board[i + 2][j] != '#') {
					System.out.println("NO");
					return;
				} else {
					board[i + 2][j] = '.';
				}
				if (board[i + 1][j + 1] != '#') {
					System.out.println("NO");
					return;
				} else {
					board[i + 1][j + 1] = '.';
				}
				if (board[i + 1][j - 1] != '#') {
					System.out.println("NO");
					return;
				} else {
					board[i + 1][j - 1] = '.';
				}
				board[i][j] = '.';
			}
		}
		System.out.println("YES");
	}
}
