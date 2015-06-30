import java.util.Scanner;

public class A462 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[][] chessBoard = new char[n][n];
		for (int i = 0; i < n; ++i) {
			chessBoard[i] = in.next().toCharArray();
		}

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				int countX = 0;
				int countO = 0;
				if (i - 1 >= 0 && chessBoard[i - 1][j] == 'x') {
					countX++;
				} else if (i - 1 >= 0) {
					countO++;
				}

				if (i + 1 < n && chessBoard[i + 1][j] == 'x') {
					countX++;
				} else if (i + 1 < n) {
					countO++;
				}
				if (j - 1 >= 0 && chessBoard[i][j - 1] == 'x') {
					countX++;
				} else if (j - 1 >= 0) {
					countO++;
				}

				if (j + 1 < n && chessBoard[i][j + 1] == 'x') {
					countX++;
				} else if (j + 1 < n) {
					countO++;
				}
				if ( (countO & 1) > 0) {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");

	}

}
