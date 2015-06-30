import java.util.Scanner;

public class A165 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Point1[] points = new Point1[n];
		for (int i = 0; i < n; ++i) {
			points[i] = new Point1(in.nextInt(), in.nextInt());
		}
		int result = 0;
		for (int i = 0; i < n; ++i) {
			int countLower = 0;
			int countUpper = 0;
			int countLeft = 0;
			int countRight = 0;

			for (int j = 0; j < n; ++j) {
				if (i == j) {
					continue;
				}
				if (points[i].x == points[j].x) {
					if (points[i].y < points[j].y) {
						countUpper++;
					} else {
						countLower++;
					}
				} else if (points[i].y == points[j].y) {
					if (points[i].x > points[j].x) {
						countLeft++;
					} else {
						countRight++;
					}
				}
			}

			if (countLeft > 0 && countLower > 0 && countRight > 0
					&& countUpper > 0) {
				result++;
			}
		}
		System.out.println(result);

	}

	static class Point1 {
		int x;
		int y;

		public Point1(int x, int y) {
			this.x = x;
			this.y = y;

		}
	}
}
