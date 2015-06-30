import java.util.Scanner;

public class A350 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int max = 0;
		int min = Integer.MAX_VALUE;
		int minCorrect = min;
		for (int i = 0; i < n; ++i) {
			int a = in.nextInt();
			max = Math.max(max, a);
			minCorrect = Math.min(minCorrect, a);

		}
		for (int i = 0; i < m; ++i) {
			min = Math.min(min, in.nextInt());

		}

		int tl = Math.max(minCorrect << 1, max);

		if (tl >= min) {
			System.out.println(-1);
			return;
		}
		System.out.println(tl);
	}
}
