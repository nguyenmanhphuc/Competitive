import java.util.Scanner;

//not completed

public class C3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[][] cs = new char[3][3];
		cs[0] = in.next().toCharArray();
		cs[1] = in.next().toCharArray();
		cs[2] = in.next().toCharArray();

		boolean valid = true;
		int countX = 0;
		int count0 = 0;
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				if (cs[i][j] == 'X') {
					countX++;
				} else if (cs[i][j] == '0') {
					count0++;
				}
			}
		}

		if (countX - count0 < 0 || countX > count0 + 1) {
			System.out.println("illegal");
			return;
		}

		int s = checkWin(cs);

		if (s == -2) {
			System.out.println("illegal");
			return;
		}
		if (s == 'X') {
			if (countX > count0) {
				System.out.println("the first player won");
			} else {
				System.out.println("illegal");
			}
			return;
		} else if (s == '0') {
			if (count0 == countX) {
				System.out.println("the second player won");
			} else {
				System.out.println("illegal");
			}
			return;
		}

		if (countX + count0 == 9) {
			System.out.println("draw");
		} else if (countX > count0) {
			System.out.println("second");
		} else {
			System.out.println("first");
		}

	}

	private static boolean checkD(char[][] cs) {
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				if (cs[i][j] == '.') {
					return false;
				}
			}
		}
		return true;

	}

	private static int checkWin(char[][] cs) {
		int countW = 0;
		int w = -1;
		for (int i = 0; i < 3; ++i) {
			if (cs[i][0] == cs[i][1] && cs[i][1] == cs[i][2]) {
				if (cs[i][0] == '.')
					continue;
				if (w == -1) {
					w = cs[i][0];
				} else if (cs[i][0] != w && w != '.') {
					return -2;
				} else {
					w = cs[i][0];
				}

			}

			if (cs[0][i] == cs[1][i] && cs[1][i] == cs[2][i]) {
				if (cs[0][i] == '.')
					continue;
				if (w == -1) {
					w = cs[0][i];
				} else if (cs[0][i] != w && w != '.') {
					return -2;
				} else {
					w = cs[0][i];
				}
			}
		}

		if (cs[0][0] == cs[1][1] && cs[1][1] == cs[2][2]) {
			if (cs[0][0] == '.') {

			} else

			if (w == -1) {
				w = cs[0][0];
			} else if (cs[0][0] != w && w != '.') {
				return -2;
			} else {
				w = cs[0][0];
			}
		}
		if (cs[2][0] == cs[1][1] && cs[0][2] == cs[1][1]) {
			if (cs[2][0] == '.') {

			} else if (w == -1) {
				w = cs[2][0];
			} else if (cs[2][0] != w && w != '.') {
				return -2;
			} else {
				w = cs[0][0];
			}
		}

		return w;

	}
}
