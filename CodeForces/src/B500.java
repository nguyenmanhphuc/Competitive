import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B500 {
	static List<Integer>[] vides;
	static boolean[] used;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p[] = new int[n];
		for (int i = 0; i < n; ++i) {
			p[i] = in.nextInt();
		}
		char[][] A = new char[n][];
		for (int i = 0; i < n; ++i) {
			A[i] = in.next().toCharArray();
		}
		vides = new List[n];
		for (int i = 0; i < n; ++i) {
			vides[i] = new ArrayList<>();
		}
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (A[i][j] == '1') {
					vides[i].add(j);
					vides[j].add(i);
				}
			}
		}

		used = new boolean[n];
		for (int i = 0; i < n; ++i) {
			if (!used[i]) {
				List<Integer> component = new ArrayList<>();
				dfs(i, component);
				int[] values = new int[component.size()];
				int index = 0;
				for (int j : component) {
					values[index++] = p[j];
				}
				Arrays.sort(values);
				Collections.sort(component);
				for (int j = 0; j < values.length; ++j) {
					p[component.get(j)] = values[j];
				}
			}
		}
		System.out.print(p[0]);
		for (int i = 1; i < n; ++i) {
			System.out.print(" " + p[i]);
		}
		System.out.println();
	}

	private static void dfs(int i, List<Integer> component) {
		component.add(i);
		used[i] = true;
		for (Integer v : vides[i]) {
			if (!used[v]) {
				dfs(v, component);
			}
		}
	}
}
