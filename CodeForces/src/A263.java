import java.util.Scanner;

public class A263 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int i = 1; i < 6; ++i) {
			for (int j = 1; j < 6; ++j) {
				int n = in.nextInt();
				if (n == 1) {
					int result = Math.abs(3 - i) + Math.abs(j - 3);
					System.out.println(result);
					return;
				}
			}
		}

	}

}
