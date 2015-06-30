import java.util.Scanner;

public class B298 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();

		char[] windDirections = in.next().toCharArray();
		int need[] = new int[300];
		need['S'] = Math.max(0, y - b);
		need['N'] = Math.max(0, b - y);
		need['E'] = Math.max(0, a - x);
		need['W'] = Math.max(0, x - a);
		for (int i = 0; i < t; ++i) {
			need[windDirections[i]]--;
			if (need['S'] <= 0 && need['E'] <= 0 && need['W'] <= 0
					&& need['N'] <= 0) {
				System.out.println(i + 1);
				return;
			}
		}
		System.out.println(-1);

	}
}
