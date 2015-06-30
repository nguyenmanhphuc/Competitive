import java.util.Arrays;
import java.util.Scanner;

public class PTIT121A {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int maxX = Integer.MIN_VALUE;
		int minX = Integer.MAX_VALUE;

		Rectangle[] rectangles = new Rectangle[n];

		for (int i = 0; i < n; ++i) {

			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int x2 = in.nextInt();
			int y2 = in.nextInt();

			rectangles[i] = new Rectangle(x1, y1, x2, y2);

			maxX = Math.max(maxX, x2);
			minX = Math.min(minX, x1);
		}

		Arrays.sort(rectangles);

		long sum = 0;
		for (int i = minX; i < maxX; ++i) {
			long upper = Long.MAX_VALUE;
			for (int j = 0; j < n; ++j) {
				if (i < rectangles[j].highX || i >= rectangles[j].lowX) {
					continue;
				}
				if (rectangles[j].highY <= upper) {
					upper = rectangles[j].lowY;
					sum += rectangles[j].highY - rectangles[j].lowY;
				} else if (rectangles[j].lowY < upper) {
					sum += upper - rectangles[j].lowY;
					upper = rectangles[j].lowY;
				}

			}
		}

		System.out.println(sum);

	}
}

class Rectangle implements Comparable<Rectangle> {
	public int highX;
	public int highY;
	public int lowX;
	public int lowY;

	public Rectangle(int highX, int highY, int lowX, int lowY) {
		super();
		this.highX = highX;
		this.highY = highY;
		this.lowX = lowX;
		this.lowY = lowY;
	}

	@Override
	public int compareTo(Rectangle arg0) {

		if (this.highY != arg0.highY) {
			return -this.highY + arg0.highY;
		}

		return -this.lowY + arg0.lowY;
	}
}
