import java.util.Scanner;

public class A384 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[][] chessBoard = new char[n][n];
		int count = 0;
		count = n % 2 == 0 ? n * n >> 1 : (n * n >> 1) + 1;
		System.out.println(count);
		for (int i = 0; i < n; ++i) {

			for (int j = 0; j < n; ++j) {
				chessBoard[i][j] = ((i + j) & 1) == 0 ? 'C' : '.';
			}
			System.out.println(new String(chessBoard[i]));
		}

	}
}
