import java.util.Scanner;

public class A499 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int cur = 1;
		int result = 0;
		for (int i = 0; i < n; ++i) {
			int l = in.nextInt();
			int r = in.nextInt();
			// result += r - l + 1;
			int temp = (l - cur) / x;
			cur += x * temp;
			result += (r - cur + 1);
			cur = r + 1;
		}
		System.out.println(result);
	}
}
