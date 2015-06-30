import java.util.Scanner;

public class F100694 {
	static int n;
	static int m;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		int productivities[] = new int[n];
		for (int i = 0; i < n; ++i) {
			productivities[i] = in.nextInt();
		}

		int max = -1;

		String[] names = new String[n];
		for (int i = 0; i < n; ++i) {
			names[i] = in.next();
		}

		char[][] matrix = new char[n][];
		for (int i = 0; i < n; ++i) {
			matrix[i] = in.next().toCharArray();
		}

		int Max1 = -1;
		int Max2 = -1;
		int max3 = -1;
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				for (int k = j + 1; k < n; ++k) {
					int count = cal(i, j, k, productivities, matrix);
					if (count > max) {
						Max1 = i;
						Max2 = j;
						max3 = k;
						max = count;
					}
				}
			}
		}

		System.out.println(max);
		System.out.println(names[Max1] + " " + names[Max2] + " " + names[max3]);
	}

	private static int cal(int i, int j, int k, int[] productivities,
			char[][] matrix) {
		int count = 0;
		int a = 0; // 12
		int b = 0; // 13
		int c = 0; // 23
		int d = 0; // 132
		int maxA = productivities[i];
		int maxB = productivities[j];
		int maxC = productivities[k];

		for (int h = 0; h < m; h++) {
			if (matrix[i][h] == '1') {
				if (matrix[k][h] == '1' && matrix[j][h] == '1') {
					d++;
				} else if (matrix[j][h] == '1') {
					a++;
				} else if (matrix[k][h] == '1') {
					b++;
				} else if (maxA > 0) {
					maxA--;
					count++;
				}

			} else if (matrix[j][h] == '1') {
				if (matrix[k][h] == '1') {
					c++;
				} else if (maxB > 0) {
					maxB--;
					count++;
				}
			} else if (matrix[k][h] == '1') {
				if (maxC > 0) {
					maxC--;
					count++;
				}
			}
		}

		int more = 0;
		/*
		 * int min = Math.min(maxA, a); for (int h = 0; h <= min; ++h) { more =
		 * Math.max(cal(h, a, b, c, d, maxA, maxB, maxC), more); }
		 */

		int sumAB = maxA + maxB;
		if (maxA + maxB < a) {
			more = sumAB;
			sumAB = 0;
		} else {
			more = a;
			sumAB -= a;
		}

		int sumBC = b + c;

		if (sumBC < sumAB) {
			more += sumBC;
			sumAB -= sumBC;
			sumBC = 0;
		} else {
			more += sumAB;
			sumBC -= sumAB;
			sumAB = 0;
		}

		more += Math.min(maxC + sumAB, sumBC + d);

		return count + more;
	}

	private static int cal(int h, int a, int b, int c, int d, int maxA,
			int maxB, int maxC) {
		int result = h;
		maxA -= h;
		a -= h;

		int temp = Math.min(a, maxB);
		result += temp;
		maxB -= temp;
		a -= temp;

		temp = Math.min(b, maxA);
		b -= temp;
		maxA -= temp;
		result += temp;

		temp = Math.min(b, maxC);
		result += temp;
		maxC -= temp;
		b -= temp;

		temp = Math.min(c, maxB);
		result += temp;
		maxB -= temp;
		c -= temp;

		temp = Math.min(c, maxC);
		maxC -= temp;
		result += temp;
		c -= temp;

		result += Math.min(d, maxC + maxA + maxB);
		return result;
	}
}
