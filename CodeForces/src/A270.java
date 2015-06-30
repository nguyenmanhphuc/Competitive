import java.util.Scanner;

public class A270 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		boolean check[] = new boolean[181];

		for (int i = 0; i < n; ++i) {
			int temp = in.nextInt();
			int gcd = gcd(180, temp);
			int a = temp / gcd;
			int b = 180 / gcd;
			if (a + 2 == b || a + 1 == b) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

	static int gcd(int a, int b) {
		return a % b == 0 ? b : gcd(b, a % b);
	}

}
