import java.util.Scanner;

public class A217 {

	static int n;
	static int m;
	static int[] x;
	static int[] y;
	static boolean visited[];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 n = in.nextInt();
		// int m = in.nextInt();
		x = new int[n];
		y = new int[n];
		visited = new boolean[n];
		for (int i = 0; i < n; ++i) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}

		int count = 0;
		for (int i = 0; i < n; ++i) {
			if (!visited[i]) {
				count++;
				dfs(i);
			}
		}
		System.out.println(count - 1);

	}

	private static void dfs(int i) {
		visited[i] = true;
		for (int j = 0; j < n; ++j) {
			if (!visited[j] && (x[i] == x[j] || y[i] == y[j])) {
				dfs(j);
			}
		}

	}
}
