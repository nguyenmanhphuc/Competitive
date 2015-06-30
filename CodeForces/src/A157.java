import java.util.Scanner;

public class A157 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] cols = new int[n];
		int[] rows = new int[n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				int value = in.nextInt();
				cols[j] += value;
				rows[i] += value;
			}
		}
		int countWinningSquares = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (cols[j] > rows[i]) {
					countWinningSquares++;
				}
			}
		}
		System.out.println(countWinningSquares);
	}

}
