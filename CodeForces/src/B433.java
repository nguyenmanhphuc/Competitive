import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class B433 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Long[] cost = new Long[n];

		Long[] sum = new Long[n];
		cost[0] = in.nextLong();
		sum[0] = cost[0];
		for (int i = 1; i < n; ++i) {
			cost[i] = in.nextLong();
			sum[i] = sum[i - 1] + cost[i];
		}

		Arrays.sort(cost);
		for (int i = 1; i < n; ++i) {
			cost[i] += cost[i - 1];
		}
		PrintWriter writer = new PrintWriter(System.out);
		StringBuilder str = new StringBuilder();
		int m = in.nextInt();
		for (int i = 0; i < m; ++i) {
			int type = in.nextInt();
			int left = in.nextInt();
			int right = in.nextInt();
			if (type == 1) {
				long result = sum[right - 1] - (left == 1 ? 0 : sum[left - 2]);
				writer.println(result);
			} else {
				long result = cost[right - 1]
						- (left == 1 ? 0 : cost[left - 2]);
				writer.println(result);
			}
		}

		writer.close();

	}
}
