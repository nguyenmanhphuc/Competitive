import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class C20 {

	static PriorityQueue<AdjacentNode> queue = new PriorityQueue<>();
	static List<AdjacentNode>[] adjacentNodes;
	static int pre[];
	static boolean visited[];
	static long distance[];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		adjacentNodes = new List[n + 1];
		
		for(int i =1; i<=n; ++i){
			adjacentNodes[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < m; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			int dis = in.nextInt();
			if (adjacentNodes[a] == null) {
				adjacentNodes[a] = new ArrayList<AdjacentNode>();
			}
			if (adjacentNodes[b] == null) {
				adjacentNodes[b] = new ArrayList<AdjacentNode>();
			}

			adjacentNodes[b].add(new AdjacentNode(a, dis));
			adjacentNodes[a].add(new AdjacentNode(b, dis));

		}

		int start = 1;
		int end = n;
		distance = new long[n + 1];
		visited = new boolean[n + 1];
		pre = new int[n + 1];
		queue.add(new AdjacentNode(1, 0));
		Arrays.fill(distance, Long.MAX_VALUE);
		distance[1] = 0;
		shortestPath();

		int cur = n;
		if (distance[n] == Long.MAX_VALUE) {
			System.out.println(-1);
			return;
		}

		Stack<Integer> stack = new Stack<>();

		while (cur != 1) {
			stack.add(cur);
			cur = pre[cur];
		}
		stack.add(1);

		StringBuilder str = new StringBuilder();
		while (stack.peek() != n) {
			str.append(stack.pop());
			str.append(' ');
		}
		str.append(stack.pop());
		System.out.println(str);

	}

	private static void shortestPath() {
		while (!queue.isEmpty()) {
			AdjacentNode node = queue.poll();
			visited[node.indexNode] = true;

			for (AdjacentNode n : adjacentNodes[node.indexNode]) {
				if (distance[node.indexNode] + n.distance < distance[n.indexNode]) {
					distance[n.indexNode] = distance[node.indexNode]
							+ n.distance;
					queue.add(new AdjacentNode(n.indexNode,
							distance[n.indexNode]));
					pre[n.indexNode] = node.indexNode;
				}
			}
		}

	}

}

class AdjacentNode implements Comparable<AdjacentNode> {
	int indexNode;
	long distance;

	public AdjacentNode() {
		// TODO Auto-generated constructor stub
	}

	public AdjacentNode(int indexNode, long distance) {
		super();
		this.indexNode = indexNode;
		this.distance = distance;
	}

	@Override
	public int compareTo(AdjacentNode node) {
		return Long.compare(distance, node.distance);
	}
}