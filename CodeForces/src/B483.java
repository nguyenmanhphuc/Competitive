import java.util.Scanner;

public class B483 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c1 = in.nextInt();
		int c2 = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int z = a * b;
		long left = 1;
		long right = Integer.MAX_VALUE - 2;
		int c = c1 + c2;
		while (left < right) {
			long mid = (left + right + 1) >> 1;

			if (mid - mid / z >= c && mid - mid / a >= c1
					&& mid - mid / b >= c2) {
				right = mid - 1;
			} else {
				left = mid;
			}
		}

		if (left - left / z < c || left - left / a < c1 || left - left / b < c2) {
			left++;
		}
		System.out.println(left);

	}

}
