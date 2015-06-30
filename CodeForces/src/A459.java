import java.util.Scanner;

public class A459 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		if (x1 == x2) {
			int dis = y1 - y2;
			int x = x1 + dis;
			System.out.println(x + " " + y1 + " " + x + " " + y2);
		} else if (y1 == y2) {
			int dis = x1 - x2;
			int y = y1 + dis;
			System.out.println(x1 + " " + y + " " + x2 + " " + y);
		} else {
			if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
				System.out.println(x1 + " " + y2 + " " + x2 + " " + y1);
			} else {
				System.out.println(-1);
			}
		}

	}

}
