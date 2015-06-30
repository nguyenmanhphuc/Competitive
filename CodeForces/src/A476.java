import java.util.Scanner;

public class A476 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long m = in.nextLong();
		if (n < m) {
			System.out.println(-1);
		} else {
			long min = (n + 1) >> 1;
			System.out.println((min + m - 1) / m * m);
		}
		//return 0;
	}
}
