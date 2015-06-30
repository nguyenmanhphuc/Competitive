import java.util.Scanner;

public class B2 {
	static StringBuilder str = new StringBuilder();
	static boolean chosenPath;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Cell[][] cells = new Cell[n + 1][n + 1];
		for (int i = 0; i <= n; ++i) {
			cells[i][0] = new Cell(1);
		}
		for (int i = 1; i <= n; ++i) {
			cells[0][i] = new Cell(1);
		}

		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n; ++j) {
				cells[i][j] = new Cell(in.nextInt());

				int mul2 = Math.min(cells[i - 1][j].m2, cells[i][j - 1].m2);
				int mul5 = Math.min(cells[i - 1][j].m5, cells[i][j - 1].m5);

				cells[i][j].min2 = cells[i][j].m2 + mul2;
				cells[i][j].min5 = cells[i][j].m5 + mul5;
			}
		}
		chosenPath = cells[n][n].min2 < cells[n][n].min5;
		str = new StringBuilder();
		getPath(cells, n, n);

	}

	private static void getPath(Cell[][] cells, int r, int c) {
		if (c == 1 && c == 1) {
			return;
		}

		if (chosenPath) {
			int min = cells[r][c].min2 - cells[r][c].m2;
			if (r == 1) {

			} else if (c == 1) {

			}

		}
	}
}

class Cell {
	public int value;
	public int m2;
	public int m5;
	public int min2;
	public int min5;

	public Cell(int value) {
		this.value = value;
		this.m2 = countMulti(value, 2);
		this.m2 = countMulti(value, 5);
	}

	public int countMulti(int n, int value) {
		int count = 0;
		while (n % value == 0) {
			n /= value;
			count++;
		}
		return count;
	}
}
