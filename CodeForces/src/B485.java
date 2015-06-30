import java.util.Scanner;

public class B485 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long minX = Long.MAX_VALUE;
		long maxX = Long.MIN_VALUE;
		long minY = Long.MAX_VALUE;
		long maxY = Long.MIN_VALUE;

		for (int i = 0; i < n; ++i) {
			int x = in.nextInt();
			int y = in.nextInt();
			minX = Math.min(minX, x);
			maxX = Math.max(maxX, x);
			minY = Math.min(minY, y);
			maxY = Math.max(maxY, y);
		}
		long edge = Math.max((maxX - minX), (maxY - minY));
		System.out.println(edge*edge);
	}

}
