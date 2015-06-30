import java.util.Scanner;

public class AutomaticAnswer11547 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int cas = 0; cas < t; cas++) {
			long n = in.nextLong();
			n *= 63;
			n += 7492;
			n *= 235;
			n /= 47;
			n -= 498;

			n = Math.abs(n);
			n /= 10;
			System.out.println(n % 10);

		}

	}
}
