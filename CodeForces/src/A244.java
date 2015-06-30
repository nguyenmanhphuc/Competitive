import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A244 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		List<Integer>[] segments = new List[k + 1];
		for (int i = 1; i <= k; i++) {
			segments[i] = new ArrayList<Integer>();
		}
		boolean[] given = new boolean[n * k + 1];
		for (int i = 1; i <= k; ++i) {
			int t = in.nextInt();
			segments[i].add(t);
			given[t] = true;
		}
		int cur = 1;
		for (int i = 1; i <= k; ++i) {
			int left = n - 1;
			while (left > 0) {
				if (!given[cur]) {
					segments[i].add(cur);

					left--;
				}
				cur++;
			}
		}
		PrintWriter writer = new PrintWriter(System.out);
		boolean first = true;
		for (int i = 1; i <= k; ++i) {
			first = true;

			for (int segment : segments[i]) {
				if (first) {
					first = false;
				} else {
					writer.print(' ');
				}
				writer.print(segment);
			}
			writer.println();
		}
		writer.close();

	}
}
