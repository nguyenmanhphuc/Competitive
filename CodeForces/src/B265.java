import java.util.Scanner;

public class B265 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int cur = in.nextInt();
		long total = cur;

		for (int i = 1; i < n; ++i) {
			int next = in.nextInt();
			if (next < cur) {
				total += cur - next;
			} else {
				total += next - cur;
			}
			cur = next;
		}
		total += 2 * n - 1;
		System.out.println(total);
	}

}
