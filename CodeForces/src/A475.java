import java.util.Arrays;
import java.util.Scanner;

public class A475 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char arr[][] = new char[4][];
		arr[0] = new char[27];
		arr[1] = new char[26];
		arr[2] = new char[26];
		arr[3] = new char[27];
		Arrays.fill(arr[1], '.');
		Arrays.fill(arr[0], '.');
		Arrays.fill(arr[2], '.');
		Arrays.fill(arr[3], '.');

		for (int i = 0; i < 4; ++i) {
			arr[i][0] = '|';
			arr[i][25] = '|';
			if (i != 2) {
				arr[i][23] = '|';
			}
		}
		arr[0][26] = ')';
		arr[0][24] = 'D';
		arr[3][26] = ')';
		int row = 0;
		int col = 1;
		while (col < 23) {
			if (n > 0) {
				arr[row][col] = 'O';

			} else {
				arr[row][col] = '#';

			}
			row++;
			if (row == 2 && col != 1) {
				row++;
			}
			if (row == 4) {
				row = 0;
				col += 2;
			}
			n--;
		}
		System.out.println("+------------------------+");
		for (int i = 0; i < 4; ++i) {
			System.out.println(new String(arr[i]));
		}
		System.out.println("+------------------------+");
	}
}
