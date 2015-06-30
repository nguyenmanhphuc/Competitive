import java.util.Scanner;

public class A445 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		char[][] arr = new char[n][];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.next().toCharArray();
		}
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				if (arr[i][j] == '.') {
					System.out.print((i + j) % 2 == 0 ? 'B' : 'W');
				}else{
					System.out.print(arr[i][j]);
				}
				
			}
			System.out.println();
		}

	}

}
