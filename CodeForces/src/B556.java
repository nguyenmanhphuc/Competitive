import java.util.Scanner;

public class B556 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int first = in.nextInt();
		int change = first;
		for (int i = 1; i < n; ++i) {
			if (i % 2 == 0) {
				int t = in.nextInt();
				t -= change;
				while (t < 0) {
					t += n;
				}

				if (t != i) {
					System.out.println("No");
					return;
				}
			} else {
				int t = in.nextInt();
				t += change;
				t %= n;

				if (t != i) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");

	}

}
