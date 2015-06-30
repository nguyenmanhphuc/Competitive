import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PTIT015E {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		// initReader();
		long[] count = new long[1000001];
		long[] sum = new long[1000001];

		Arrays.fill(count, 1l);
		Arrays.fill(sum, 1l);
		count[0] = 0;
		sum[0] = 0;
		for (int i = 2; i <= 1000000; ++i) {
			for (int j = i; j <= 1000000; j += i) {
				count[j]++;
				sum[j] += i;
			}
		}
		for (int i = 1; i <= 1000000; ++i) {
			sum[i] += sum[i - 1];
			count[i] += count[i - 1];
		}

		int n = in.nextInt();
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (a <= b) {
				if (a == 0) {
					str.append(count[b] + " " + sum[b]);
					str.append('\n');
					continue;
				}
				str.append((count[b] - count[a - 1]) + " "
						+ (sum[b] - sum[a - 1]));
				str.append('\n');
			} else {
				str.append("0 0\n");
			}
		}
		System.out.print(str);

	}

	static BufferedReader reader;
	static StringTokenizer tokenizer;

	public static void initReader() {
		reader = new BufferedReader(new InputStreamReader(System.in), 30720);
		tokenizer = new StringTokenizer("");
	}

	static String next() throws IOException {
		while (!tokenizer.hasMoreTokens()) {
			String n = reader.readLine();
			if (n == null) {
				return null;
			}
			tokenizer = new StringTokenizer(n);

		}
		return tokenizer.nextToken();
	}

	static String nextLine() throws IOException {
		return reader.readLine();
	}

	static Integer nextInt() throws IOException {
		String next = next();
		if (next == null) {
			return null;
		}
		return Integer.parseInt(next);
	}

	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	static Double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

}