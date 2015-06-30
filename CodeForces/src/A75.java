import java.util.Scanner;

public class A75 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int sum = a+b;

		int newA = findNew(a);
		int newB = findNew(b);
		int s = findNew(sum);
		if (newA + newB == s) {
			System.out.println("YES");

		} else {
			System.out.println("NO");
		}
	}

	private static int findNew(int b) {
		int result = 0;
		int cur = 1;
		while (b > 0) {
			int m = b % 10;
			if (m > 0) {
				result += m * cur;
				cur *= 10;
			}
			b/=10;
		}
		return result;
	}

}
