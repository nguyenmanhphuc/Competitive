import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class A115 {
	static List<Integer>[] employees;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max = 1;
		int n = in.nextInt();
		int[] p = new int[n];
		employees = new List[n];
		for (int i = 0; i < n; ++i) {
			employees[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < n; ++i) {
			p[i] = in.nextInt();
			if (p[i] != -1) {
				employees[p[i] - 1].add(i);
			}
		}
		for (int i = 0; i < n; ++i) {
			if (p[i] == -1) {
				max = Math.max(max, dfs(i, 0));
			}
		}
		System.out.println(max);
	}

	private static int dfs(int i, int height) {
		int max = height + 1;
		for (int index : employees[i]) {
			max = Math.max(max, dfs(index, height + 1));
		}
		return max;
	}
}
