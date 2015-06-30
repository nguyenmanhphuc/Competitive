import java.util.Scanner;

public class C551 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		long sum = 0;
		int last = 0;
		for (int i = 1; i <= n; ++i) {
			int t = in.nextInt();
			if (t > 0) {
				last = i;
				sum += t;
			}
		}

		if (sum == 0) {
			System.out.println(0);
			return;
		}

		sum += last;
		last -=1;

	}
}
