import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C276 {

	public static void main(String[] args) throws IOException {
		initReader();
		int n = nextInt();
		int q = nextInt();
		SegmentTree tree = new SegmentTree(n);
		Integer[] value = new Integer[n];
		for (int i = 0; i < n; ++i) {
			value[i] = nextInt();
		}

		for (int i = 0; i < q; ++i) {
			int left = nextInt();
			int right = nextInt();
			tree.Add(left - 1, right - 1);
		}
		Integer[] times = new Integer[n];
		for (int i = 0; i < n; ++i) {
	
			times[i] = tree.Get(i, i);
		}
		Arrays.sort(times);
		Arrays.sort(value);
		long result = 0;
		for (int i = 0; i < n; ++i) {
			result += (long) value[i] * times[i];
		}
		System.out.println(result);
	}

	static BufferedReader reader;
	static StringTokenizer tokenizer;

	public static void initReader() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		tokenizer = new StringTokenizer("");
	}

	static String next() throws IOException {
		while (!tokenizer.hasMoreTokens()) {
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}

	static String nextLine() throws IOException {
		return reader.readLine();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	static Double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

}

class SegmentTree {
	int tree[];
	int length;
	int value[];

	public SegmentTree(int size) {
		length = size;
		tree = new int[length * 4 + 10];
	}

	public SegmentTree(int[] arr) {
		length = arr.length;
		tree = new int[length * 2 + 10];
	}

	public int leftChild(int root) {
		return root * 2 + 1;
	}

	public int rightChild(int root) {
		return root * 2 + 2;
	}

	public void Add(int l, int r) {
		Add(0, 0, length - 1, l, r);
	}

	void Add(int root, int left, int right, int l, int r) {
		if (r < left | l > right) {
			return;
		}
		if (r >= right && l <= left) {
			tree[root]++;
			return;
		}

		int mid = (left + right) >> 1;
		Add(leftChild(root), left, mid, l, r);
		Add(rightChild(root), mid + 1, right, l, r);
	}

	public int Get(int l, int r) {
		return Get(0, 0, length - 1, l, r);
	}

	public int Get(int root, int left, int right, int l, int r) {
		if (r < left | l > right) {
			return 0;
		}
		if (r >= right && l <= left) {
			return tree[root];
		}
		int mid = (left + right) >> 1;
		int result = Get(leftChild(root), left, mid, l, r);
		result += Get(rightChild(root), mid + 1, right, l, r);
		return result + tree[root];
	}
}
