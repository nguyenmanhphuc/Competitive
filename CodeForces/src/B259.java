import java.util.Scanner;

public class B259 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int matrix[][] = new int[3][3];
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				matrix[i][j] = in.nextInt();
			}
		}

		int A = matrix[1][0] + matrix[2][0];
		int B = matrix[0][1] + matrix[2][1];
		int C = matrix[1][2] + matrix[0][2];
		int a = (B + C - A) >> 1;
		int b = a + A - B;
		int c = a + A - C;
		matrix[0][0] = a;
		matrix[1][1] = b;
		matrix[2][2] = c;

		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				if (j > 0) {
					System.out.print(" ");
				}
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}
