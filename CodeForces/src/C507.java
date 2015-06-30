import java.util.Scanner;

public class C507 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		long n = in.nextLong();
		long count = 0;
		long l = 1;
		long r = 1L << h;
		boolean isL = false;
		for (int i = 0; i < h; ++i) {
			long mid = (l + r) >> 1;

			if (n > mid) {
				if (!isL) {
					count += (1l << (h - i));
				} else {
					count++;
				}
				isL = false;
				l = mid + 1;
			} else {
				if (isL) {
					count += (1l << (h - i ));
				} else {
					count++;
				}
				isL = true;
				r = mid;
			}
		}
		System.out.println(count);
	}
}
