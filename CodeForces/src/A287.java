import java.util.Scanner;

public class A287 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int case1 = 3 * '#' + '.';
		int case2 = 3 * '.' + '#';
		int max = Math.max(case1, case2);
		int min = Math.min(case2, case1);
		char[][] matrix = new char[4][];
		for (int i = 0; i < 4; ++i) {
			matrix[i] = in.next().toCharArray();
		}
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				int sum = matrix[i][j] + matrix[i][j + 1]
						+ matrix[i + 1][j + 1] + matrix[i + 1][j];
				if (sum >= max || sum <= min) {
					System.out.println("YES");
					return;
				}
			}
		}
		System.out.println("NO");
	}
}
