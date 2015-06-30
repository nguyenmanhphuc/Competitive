import java.util.Scanner;

public class B507 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long r = in.nextLong();

		long x = in.nextLong();
		long y = in.nextLong();
		long a = in.nextLong();
		long b = in.nextLong();

		long z = (x - a) * (x - a) + (y - b) * (y - b);

		long r2 = r * r;

		long temp = z / 4 / r2;
		long s = (long) Math.sqrt(temp);
		if (s * s * 4 * r2 != z) {
			System.out.println(s + 1);
		} else {
			System.out.println(s);
		}
	}
}
