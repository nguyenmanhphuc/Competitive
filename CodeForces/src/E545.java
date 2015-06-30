import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class E545 {
	static long min[];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PriorityQueue<EG> q = new PriorityQueue<>();
		int n = in.nextInt();
		int m = in.nextInt();

		List<EG>[] g = new List[n + 1];
		for (int i = 1; i <= n; ++i) {
			g[i] = new ArrayList<EG>();
		}

		for (int i = 0; i < m; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			g[a].add(new EG(i + 1, b, c, c));
			g[b].add(new EG(i + 1, a, c, c));
		}
		int end = in.nextInt();
		long[] min = new long[n + 1];

		int countNode = 0;
		boolean[] visted = new boolean[n + 1];

		for (EG e : g[end]) {
			q.add(e);
		}
		q.add(new EG(0, end, 0, 0));
		Integer[] eg = new Integer[n];
		long sum = 0;

		while (countNode < n) {
			EG e = q.poll();
			while (visted[e.node]) {
				e = q.poll();
			}
			sum += e.edge;
			visted[e.node] = true;
			eg[countNode] = e.index;
			countNode++;
			for (EG eo : g[e.node]) {
				if (!visted[eo.node]) {
					q.add(new EG(eo.index, eo.node, eo.edge + e.weight, eo.edge));
				}
			}
		}

		StringBuilder str = new StringBuilder();
		str.append(sum);

		if (n == 1) {
			System.out.println(0);
			return;
		}
		str.append('\n');
		for (int i = 1; i < n; ++i) {
			if (i > 1) {
				str.append(' ');
			}
			str.append(eg[i]);

		}
		System.out.println(str);
	}
}

class EG implements Comparable<EG> {
	int index;
	int node;
	long weight;
	long edge;

	public EG(int index, int node, long weight, long edge) {

		this.index = index;
		this.node = node;
		this.weight = weight;
		this.edge = edge;
	}

	@Override
	public int compareTo(EG e) {
		if (e.weight != this.weight) {
			return Long.compare(this.weight, e.weight);
		}
		return Long.compare(this.edge, e.edge);
	}
}
