import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C437 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int energy[] = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			energy[i] = in.nextInt();
		}
		List<Integer> adj[] = new List[n + 1];
		for (int i = 1; i <= n; ++i) {
			adj[i] = new ArrayList<>();
		}
		int total[] = new int[n + 1];
		for (int i = 0; i < m; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			total[a] += energy[a];
			total[b] += energy[b];
			adj[a].add(b);
			adj[b].add(a);
		}

		long result = 0;
		boolean[] remove = new boolean[n + 1];
		total[0] = Integer.MAX_VALUE;
		energy[0] = -1;
		for (int i = 0; i < n; ++i) {
			int min = 0;
			for (int j = 1; j <= n; ++j) {
				if (!remove[j] && energy[j] > energy[min]) {
					min = j;
				}
			}
			result += total[min];
			remove[min] = true;

			for (Integer part : adj[min]) {
				total[part] -= energy[min];
			}
		}
		System.out.println(result);

	}
}
