public class SegmentTree2 {
	private static int n;
	private static final int MAX = 1 << 20;
	static int arr[];
	static int tree[];
	static int lazy[];

	static void build_tree(int node, int a, int b) {
		if (a > b)
			return; // Out of range

		if (a == b) { // Leaf node
			tree[node] = arr[a]; // Init value
			return;
		}

		build_tree(node * 2, a, (a + b) / 2); // Init left child
		build_tree(node * 2 + 1, 1 + (a + b) / 2, b); // Init right child

		tree[node] = Math.max(tree[node * 2], tree[node * 2 + 1]); // Init root
																	// value
	}

	static void update_tree(int node, int a, int b, int i, int j, int value) {

		if (lazy[node] != 0) { // This node needs to be updated
			tree[node] += lazy[node]; // Update it

			if (a != b) {
				lazy[node * 2] += lazy[node]; // Mark child as lazy
				lazy[node * 2 + 1] += lazy[node]; // Mark child as lazy
			}

			lazy[node] = 0; // Reset it
		}

		if (a > b || a > j || b < i) // Current segment is not within range [i,
										// j]
			return;

		if (a >= i && b <= j) { // Segment is fully within range
			tree[node] += value;

			if (a != b) { // Not leaf node
				lazy[node * 2] += value;
				lazy[node * 2 + 1] += value;
			}

			return;
		}

		update_tree(node * 2, a, (a + b) / 2, i, j, value); // Updating left
															// child
		update_tree(1 + node * 2, 1 + (a + b) / 2, b, i, j, value); // Updating
																	// right
																	// child

		tree[node] = Math.max(tree[node * 2], tree[node * 2 + 1]); // Updating
																	// root with
																	// max value
	}

	static int query_tree(int node, int a, int b, int i, int j) {

		if (a > b || a > j || b < i)
			return Integer.MIN_VALUE; // Out of range

		if (lazy[node] != 0) { // This node needs to be updated
			tree[node] += lazy[node]; // Update it

			if (a != b) {
				lazy[node * 2] += lazy[node]; // Mark child as lazy
				lazy[node * 2 + 1] += lazy[node]; // Mark child as lazy
			}

			lazy[node] = 0; // Reset it
		}

		if (a >= i && b <= j) // Current segment is totally within range [i, j]
			return tree[node];

		int q1 = query_tree(node * 2, a, (a + b) / 2, i, j); // Query left child
		int q2 = query_tree(1 + node * 2, 1 + (a + b) / 2, b, i, j); // Query
																		// right
																		// child

		int res = Math.max(q1, q2); // Return final result

		return res;
	}

	public static void main(String[] args) {
		n = 100;
		arr = new int[2000000];
		tree = new int[2000000];
		lazy = new int[2000000];
		for (int i = 0; i < n; i++)
			arr[i] = 1;

		build_tree(1, 0, n - 1);
		

		update_tree(1, 0, n - 1, 0, 6, 5); // Increment range [0, 6] by 5
		update_tree(1, 0, n - 1, 7, 10, 12); // Incremenet range [7, 10] by 12
		update_tree(1, 0, n - 1, 10, n - 1, 100); // Increment range [10, N-1]
													// by 100
		System.out.println(query_tree(1, 0, n - 1, 0, n - 1)); // Get max
																// element in
																// range [0,
																// N-1]

	}
}
