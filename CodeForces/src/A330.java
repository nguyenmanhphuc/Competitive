import java.util.Scanner;

public class A330 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int c = in.nextInt();
		int count = 0;
		int countC = 0;
		in.nextLine();
		char[][] arr = new char[r][c];
		for (int i = 0; i < r; ++i) {
			arr[i] = in.nextLine().toCharArray();
		}

		boolean[] rows = new boolean[r];
		boolean[] columns = new boolean[c];
		for (int i = 0; i < r; ++i) {
			for (int j = 0; j < c; ++j) {
				if (arr[i][j] == 'S') {
					rows[i] = true;
					columns[j] = true;
				}
			}

		}

		for (int i = 0; i < r; ++i) {
			for (int j = 0; j < c; ++j) {
				if ((rows[i] && columns[j])) {
					continue;
				}
				count++;
			}

		}
		System.out.println(count);
	}

}
