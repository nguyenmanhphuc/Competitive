import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B445 {

	static boolean visited[];
	static int n;
	static int m;
	static List p[];
	static int count = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		p = new List[n + 1];
		for (int i = 1; i <= n; ++i) {
			p[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			p[a].add(b);
			p[b].add(a);
		}

		long result = 1;
		visited = new boolean[n + 1];
		for (int i = 1; i <= n; ++i) {
			if (!visited[i]) {
				count++;
				dfs(i);
			}
		}

		System.out.println(1l << (n - count));
	}

	private static void dfs(int i) {
		visited[i] = true;
		for (Object a : p[i]) {
			if (!visited[(int) a]) {
				dfs((int) a);
			}
		}

	}
}
