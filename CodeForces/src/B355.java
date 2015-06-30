import java.util.Scanner;

public class B355 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();

		int rides[] = new int[n + 1];
		int trolleys[] = new int[m + 1];

		int s1 = 0;
		int s2 = 0;
		int min1 = 0;
		int min2 = 0;
		for (int i = 1; i <= n; ++i) {
			rides[i] = in.nextInt();
			min1 += Math.min(rides[i] * a, b);
			s1 += rides[i];
		}

		for (int i = 1; i <= m; ++i) {
			trolleys[i] = in.nextInt();
			min2 += Math.min(trolleys[i] * a, b);
			s2 += trolleys[i];
		}

		int min = Math.min(min1, c)
				+ Math.min(min2, c);
		min = Math.min(min, d);
		System.out.println(min);

	}
}
