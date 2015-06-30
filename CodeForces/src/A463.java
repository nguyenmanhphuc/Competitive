import java.util.Scanner;

public class A463 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = in.nextInt();
		s += 0;
		int max = -1;
		for (int i = 0; i < n; ++i) {
			int x = in.nextInt();
			int y = in.nextInt();
			if (x > s || (x == s && y > 0)) {
				continue;
			}

			if (y == 0) {
				max = Math.max(max, y);
			} else {
				max = Math.max(max, 100 - y);
			}
		}
		System.out.println(max);

	}
}
