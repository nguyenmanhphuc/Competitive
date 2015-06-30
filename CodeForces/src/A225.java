import java.util.Scanner;

public class A225 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int top = in.nextInt();
		int bottom = 7 - top;
		in.nextInt();
		in.nextInt();
		for (int i = 1; i < n; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (a == bottom || 7 - a == bottom || b == bottom
					|| 7 - b == bottom) {
				System.out.println("NO");
				return;
			}

		}
		System.out.println("YES");
		return;

	}

}
