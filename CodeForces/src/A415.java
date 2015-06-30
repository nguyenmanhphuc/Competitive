import java.util.Scanner;

public class A415 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int turnOffIndex[] = new int[n + 1];
		for (int i = 0; i < m; ++i) {
			int index = in.nextInt();
			for (int j = index; j <= n; ++j) {
				if (turnOffIndex[j] == 0) {
					turnOffIndex[j] = index;
				} else {
					break;
				}
			}
		}
		System.out.print(turnOffIndex[1]);
		for (int i = 2; i <= n; ++i) {
			System.out.print(" " + turnOffIndex[i]);
		}
		System.out.println();

	}
}
