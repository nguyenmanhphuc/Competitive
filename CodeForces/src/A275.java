import java.util.Scanner;

public class A275 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		int[][] convert = new int[5][5];
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; ++j) {
				arr[i][j]=in.nextInt();
			}
		}
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; ++j) {
				convert[i][j] += arr[i][j];
				convert[i][j + 1] += arr[i][j];
				convert[i][j - 1] += arr[i][j];
				convert[i + 1][j] += arr[i][j];
				convert[i - 1][j] += arr[i][j];
			}
		}
		StringBuilder str = new StringBuilder();
		for (int i = 1; i <= 3; ++i) {
			for (int j = 1; j <= 3; ++j) {
				if ((convert[i][j] & 1) > 0) {
					str.append('0');
				} else {
					str.append('1');
				}
			}

			str.append('\n');
		}
		System.out.println(str);
	}
}
