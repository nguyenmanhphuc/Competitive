import java.util.Scanner;

public class A468 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n < 4) {
			System.out.println("NO");
			return;
		}

		System.out.println("YES");
		StringBuilder str = new StringBuilder();
		if (n == 5) {
			System.out.println("5 * 4 = 20\n2 + 3 = 5\n5 - 1 = 4\n20 + 4 = 24");
			return;
		}

		if (n == 4) {
			System.out.println("1 * 2 = 2\n2 * 3 = 6\n6 * 4 = 24");
			return;
		}
		str.append("2 * 3 = 6\n6 * 4 = 24\n6 - 5 = 1\n1 - 1 = 0\n");
		int cur = 7;
		for (; cur <= n; ++cur) {
			str.append(0 + " * " + cur + " = 0\n");
		}
		str.append("24 + 0 = 24");
		System.out.print(str);
	}
}
