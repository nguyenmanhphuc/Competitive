import java.util.Scanner;

public class B271 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] primes = generatePrimes(101000);
		int row[] = new int[n];
		int col[] = new int[m];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				int a = in.nextInt();
				int upper = upperBound(primes, a);
				col[j] += upper - a;
				row[i] += upper - a;
			}
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; ++i) {
			min = Math.min(min, row[i]);
		}

		for (int i = 0; i < m; ++i) {
			min = Math.min(min, col[i]);
		}
		System.out.println(min);
	}

	private static int[] generatePrimes(int n) {
		int count = 1;
		boolean[] primes = new boolean[n + 1];
		for (int i = 3; i <= n; i += 2) {
			if (!primes[i]) {
				for (int j = i + i; j <= n; j += i) {
					primes[j] = true;
				}
				count++;
			}
		}

		int[] result = new int[count];
		result[0] = 2;
		int index = 1;
		for (int i = 3; i <= n; i += 2) {
			if (!primes[i]) {
				result[index++] = i;
			}
		}

		return result;
	}

	private static int upperBound(int[] arr, int value) {
		int length = arr.length;
		if (value > arr[length - 1]) {
			return -1;
		}
		int left = 0;
		int right = length - 1;
		while (left < right) {
			int mid = (left + right) >> 1;
			if (arr[mid] >= value) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return arr[left];
	}
}
