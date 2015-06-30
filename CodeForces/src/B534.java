import java.util.Scanner;

public class B534 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int v1 = in.nextInt();
		int v2 = in.nextInt();

		int t = in.nextInt();
		int d = in.nextInt();

		long max = 0;
		for (int i = 0; i < t; ++i) {
			max += v1;

			int leftTime = t - i - 2;
			int maxChange = leftTime * d;

			if (v1 + d - maxChange <= v2) {
				v1 = v1 + d;
			} else {
				v1 = v2 + maxChange;
			}
		}
		System.out.println(max);

	}

}
