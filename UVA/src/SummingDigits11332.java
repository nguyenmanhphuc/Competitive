import java.util.Scanner;

public class SummingDigits11332 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		while ((n = in.nextInt()) != 0) {
			solve(n);
		}

	}

	private static void solve(int n) {
		while (n > 9) {
			int t = 0;
			while (n > 0) {
				t += n % 10;
				n /= 10;
			}
			n = t;
		}
		System.out.println(n);

	}

}
