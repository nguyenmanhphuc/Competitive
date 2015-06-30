import java.util.Scanner;

public class A127 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();

		double result = 0;
		double x = in.nextDouble();
		double y = in.nextDouble();
		for (int i = 1; i < n; ++i) {
			double nextX = in.nextDouble();
			double nextY = in.nextDouble();
			double diffX = nextX - x;
			double diffY = nextY - y;
			result += Math.sqrt(diffY * diffY + diffX * diffX);
			x = nextX;
			y = nextY;
		}
		System.out.println(result * k / 50);

	}

}
