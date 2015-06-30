import java.util.Scanner;

public class BeattheSpread10812 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		if (a < b || ((a + b) & 1) == 1) {
			System.out.println("impossible");
		} else {
			long f = (a + b) >> 1;
			long f2 = (a - f);
			System.out.println(f + " " + f2);
		}

	}
}
