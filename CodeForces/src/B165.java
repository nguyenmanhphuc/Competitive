import java.util.Scanner;

public class B165 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int left = 1;
		int right = n;
		while (left != right) {
			int mid = (left + right ) >> 1;
			long t = 1;
			long z = 0;
			while (mid / t > 0) {
				z += mid / t;
				t *= k;
			}

			if (z >= n) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		System.out.println(left);

	}

}
