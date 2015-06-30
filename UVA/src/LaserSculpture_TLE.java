import java.util.Scanner;

public class LaserSculpture_TLE {
	static int arr[];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int height = in.nextInt();

		while (height != 0) {
			int cols = in.nextInt();
			arr = new int[cols];
			long result = 0;
			for (int i = 0; i < cols; ++i) {
				arr[i] = in.nextInt();
			}
			for (int i = 0; i < cols; ++i) {
				int left = -1;
				int right = 0;
				if (arr[i] < height) {
					left = i;
					for (i = i + 1; i < cols; ++i) {
						if (arr[i] >= height) {
							right = i - 1;
							break;
						}
					}
				}
				if (i == cols) {
					right = cols - 1;
				}
				if (left >= 0) {
					result += re(left, right, height - 1) + 1;
				}
			}
			System.out.println(result);
			height = in.nextInt();
		}

	}

	private static long re(int left, int right, int max) {

		long result = 0;
		for (int i = left; i <= right; ++i) {
			int l = -1;
			int r = 0;
			if (arr[i] < max) {
				l = i;

				i = i + 1;
				for (; i <= right; ++i) {
					if (arr[i] >= max) {
						r = i - 1;
						break;
					}
				}
				if (i > right) {
					r = right;
				}
				if (l >= 0) {
					result += re(l, r, max - 1) + 1;
				}
			}

		}
		return result;
	}
}
