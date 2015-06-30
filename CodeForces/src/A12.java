import java.util.Scanner;

public class A12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		char arr[][] = new char[3][];
		for (int i = 0; i < 3; ++i) {
			arr[i] = in.next().toCharArray();
		}

		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				int r = 2 - i;
				int c = 2 - j;
				if (arr[i][j] != arr[r][c]) {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");
	}
}
