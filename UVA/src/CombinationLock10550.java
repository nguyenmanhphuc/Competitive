import java.util.Scanner;

public class CombinationLock10550 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int current = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		while (a != 0 || b != 0 || c != 0 || current != 0) {
			int r = 120;
			if (current >= a) {
				r += current - a;
			} else {
				r += current - a + 40;
			}

			if (a >= b) {
				r += b - a + 40;
			} else {
				r += b - a;
			}

			if (b >= c) {
				r += b - c;
			} else {
				r += b - c + 40;
			}
			System.out.println(r * 9);
			current = in.nextInt();
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
		}
	}
}
