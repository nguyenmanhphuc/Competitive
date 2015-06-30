import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A277 {
	static boolean[] used;
	static List<Integer>[] employees;
	static List<Integer>[] languages;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		employees = new List[n];
		languages = new List[m + 1];
		for (int i = 1; i <= m; ++i) {
			languages[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < n; ++i) {
			int t = in.nextInt();
			employees[i] = new ArrayList<>();
			for (int j = 0; j < t; ++j) {
				int language = in.nextInt();
				employees[i].add(language);
				languages[language].add(i);
			}
		}
		used = new boolean[n];
		int count = 0;
		int count0 = 0;
		for (int i = 0; i < n; ++i) {
			if (!used[i] && employees[i].size() > 0) {
				dfs(i);
				count++;
			} else if (employees[i].size() == 0) {
				count0++;
			}
		}
		System.out.println((count > 0 ? count - 1 : 0) + count0);

	}

	private static void dfs(int i) {
		used[i] = true;
		for (Integer language : employees[i]) {
			for (Integer employee : languages[language]) {
				if (!used[employee]) {
					dfs(employee);
				}
			}
		}

	}
}
