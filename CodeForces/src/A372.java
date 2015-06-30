import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A372 {

	public static void main(String[] args) throws IOException {
		initReader();

		int n = nextInt();

		Integer[] pockets = new Integer[n];
		for (int i = 0; i < n; ++i) {
			pockets[i] = nextInt();
		}

		long result = 0;
		int mid = n / 2;
		int lower = 0;
		Arrays.sort(pockets);

		for (int i = mid; i < n && lower <= mid; ++i) {
			if (pockets[i] >= 2 * pockets[lower]) {
				result++;
				lower++;
			}
		}

		System.out.println(n - Math.min(n / 2, result));
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
