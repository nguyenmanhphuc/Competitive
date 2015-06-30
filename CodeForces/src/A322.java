import java.util.Scanner;

public class A322 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		System.out.println(n + m - 1);
		for (int i = 1; i <= m; ++i) {
			System.out.println(1 + " " + i);
		}

		for (int i = 2; i <= n; ++i) {
			System.out.println(i + " " + 1);
		}

	}

}
