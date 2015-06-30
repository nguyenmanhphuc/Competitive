import java.util.Scanner;

public class C538 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int curHike = 1;
		int nextHike = in.nextInt();
		int height = in.nextInt();
		int max;
		max = height + nextHike - curHike;
		curHike = nextHike;
		for (int i = 1; i < m; ++i) {
			nextHike = in.nextInt();
			int nextHeight = in.nextInt();
			int diff = nextHike - curHike;
			if (diff < Math.abs(nextHeight - height)) {
				System.out.println("IMPOSSIBLE");
				return;
			}
			max = Math.max(
					(diff - Math.abs(nextHeight - height)) / 2
							+ Math.max(nextHeight, height), max);
			height = nextHeight;
			curHike = nextHike;
		}
		if (curHike != n) {
			max = Math.max(max, n - curHike + height);
		}

		System.out.println(max);

	}
}
