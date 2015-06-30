import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C556 {

	public static void main(String[] args) throws IOException {
		initReader();
		int n = nextInt();
		int k = nextInt();
		int inChain[] = new int[n + 1];
		int[][] chains = new int[k][];
		int count = 0;
		int c = 0;
		for (int i = 0; i < k; ++i) {
			int t = nextInt();
			chains[i] = new int[t];
			int z = 0;
			for (int j = 0; j < t; ++j) {
				int b = nextInt();
				chains[i][j] = b;
				if (chains[i][j] == j + 1) {
					count = j;
				}

			}
		}
		int sepe = n - k - count;

		System.out.println(n - k - count + (k + sepe - 1));

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
