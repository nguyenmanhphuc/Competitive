import java.util.Scanner;

public class C485 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int z = 0; z < n; ++z) {
			long l = in.nextLong();
			long r = in.nextLong();

			int[] rBits = new int[64];
			int[] lBits = new int[64];

			int index = 0;
			while (r > 0) {
				lBits[index] = (int) (l & 1);
				l = l >> 1;
				rBits[index] = (int) (r & 1);
				r = r >> 1;
				index++;
			}
			int[] resultBits = new int[64];
			for (int i = 63; i >= 0; --i) {
				if (rBits[i] == lBits[i]) {
					resultBits[i] = lBits[i];
				} else {
					int start = i;
					boolean allOne = true;
					while (i >= 0) {
						resultBits[i] = 1;

						if (rBits[i] == 0) {
							allOne = false;
						}
						i--;
					}
					resultBits[start] = allOne ? 1 : 0;
				}
			}

			long result = 0;
			long k = 1;
			for (int i = 0; i < 64; i++) {
				result += k * resultBits[i];
				k = k << 1;
			}

			System.out.println(result);
		}
	}

}
