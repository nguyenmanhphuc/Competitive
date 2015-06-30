import java.util.Scanner;

public class A11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		long pre = Long.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < n; ++i) {
			long cur = in.nextLong();
			if (cur > pre) {
				pre = cur;
			} else {
				long need = pre + 1 - cur;
				long times = (need + d - 1) / d;
				count += times;
				pre = cur + times * d;
			}
		}
		System.out.println(count);

	}
}
