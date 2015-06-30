import java.util.Arrays;
import java.util.Scanner;

public class UITD {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (in.hasNext()) {

			solve();
		}

	}

	private static void solve() {
		int n = in.nextInt();
		int m = in.nextInt();
		int t = in.nextInt();
		E[] es = new E[m];
		for (int i = 0; i < m; ++i) {
			es[i] = new E(in.nextInt(), in.nextInt(), in.nextInt());
		}

		Arrays.sort(es);

		int[] set = createSets(n + 1);
		int totalCost = 0;
		for (int i = 0; i < m; ++i) {
			if (root(set, es[i].s) == root(set, es[i].end)) {
				continue;
			} else {
				unite(set, es[i].s, es[i].end);
				totalCost += es[i].cost;
			}
		}

		for (int i = 1; i <= n; ++i) {
			root(set, i);
		}

		for (int i = 2; i <= n; ++i) {
			if (set[i] != set[i - 1]) {
				System.out.println("NO");
				return;
			}
		}
		if (totalCost > t) {
			System.out.println("NO " + (totalCost - t));
		} else {
			System.out.println("YES " + (t - totalCost));
		}
	}

	public static int[] createSets(int size) {
		int[] p = new int[size];
		for (int i = 0; i < size; i++)
			p[i] = i;
		return p;
	}

	public static int root(int[] p, int x) {
		return x == p[x] ? x : (p[x] = root(p, p[x]));
	}

	public static void unite(int[] p, int a, int b) {
		a = root(p, a);
		b = root(p, b);
		if (a != b)
			p[a] = b;
	}

}

class E implements Comparable<E> {
	int s;
	int end;
	int cost;

	public E(int s, int end, int cost) {
		super();
		this.s = s;
		this.end = end;
		this.cost = cost;
	}

	@Override
	public int compareTo(E a) {
		return Integer.compare(this.cost, a.cost);
	}
}
