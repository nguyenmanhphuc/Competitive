import java.util.Scanner;

public class A404 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		char arr[][] = new char[n][n];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextLine().toCharArray();
		}

		int a = arr[0][0];
		int b = arr[0][1];
		if (a == b) {
			System.out.println("NO");
			return;
		}

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (i == j || j + i == n - 1) {
					if (arr[i][j] != a) {
						System.out.println("NO");
						return;
					}
				} else {
					if (arr[i][j] != b) {
						System.out.println("NO");
						return;
					}
				}
			}
		}
		System.out.println("YES");

	}

}
