import java.util.Scanner;

public class A294 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int birds[] = new int[n + 2];
		for (int i = 1; i <= n; ++i) {
			birds[i] = in.nextInt();
		}
		int m = in.nextInt();
		for (int i = 0; i < m; ++i) {
			int x = in.nextInt();
			int y = in.nextInt();
			birds[x - 1] += y - 1;
			birds[x + 1] += birds[x] - y;
			birds[x] = 0;
		}

		for (int i = 1; i <= n; ++i) {
			System.out.println(birds[i]);
		}
	}
}
