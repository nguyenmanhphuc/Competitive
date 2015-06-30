import java.util.PriorityQueue;
import java.util.Scanner;

public class D447 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		int p = in.nextInt();

		PriorityQueue<Long> rq = new PriorityQueue<Long>();
		PriorityQueue<Long> cq = new PriorityQueue<Long>();
		int arr[][] = new int[n][m];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				arr[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < n; ++i) {
			long sum = 0;
			for (int j = 0; j < m; ++j) {
				sum += arr[i][j];
			}
			rq.add(-sum);
		}

		for (int i = 0; i < m; ++i) {
			long sum = 0;
			for (int j = 0; j < n; ++j) {
				sum += arr[j][i];
			}
			cq.add(-sum);
		}

		long[] sumR = new long[k + 1];
		long[] sumC = new long[k + 1];

		for (int i = 1; i <= k; ++i) {
			long maxR = -rq.poll();
			sumR[i] = sumR[i - 1] + maxR;
			maxR -= m * p;
			rq.add(-maxR);

			long maxC = -cq.poll();
			sumC[i] = sumC[i - 1] + maxC;
			maxC -= n * p;
			cq.add(-maxC);
		}

		long max = Long.MIN_VALUE;
		int j = k;
		for (int i = 0; i <= k; i++, j--) {
			max = Math.max(max, sumR[i] + sumC[j] - j * (long)i *(long)p);
		}

		System.out.println(max);
	}
}
