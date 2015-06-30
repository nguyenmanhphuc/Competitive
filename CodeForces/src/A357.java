import java.util.Scanner;

public class A357 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] groups = new int[n + 1];
		int total = 0;
		for (int i = 1; i <= n; ++i) {
			groups[i] = in.nextInt();
			total += groups[i];
		}

		int x = in.nextInt();
		int y = in.nextInt();
		if (total < 2 * x || total > 2 * y) {
			System.out.println(0);
			return;
		}

		int current = 0;
		int beginers = 0;
		for (int i = 1; i <= n; ++i) {
			beginers += groups[i];
			if (beginers > y) {
				System.out.println(0);
				return;
			} else if (beginers >= x) {
				int intermedate = total - beginers;
				if (intermedate <= y && intermedate >= x) {
					System.out.println(i + 1);
					return;
				}
			}
		}
		
		System.out.println(0);

	}
}
