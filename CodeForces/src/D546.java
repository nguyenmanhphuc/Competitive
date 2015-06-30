import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class D546 {

	public static void main(String[] args) throws IOException {
		initReader();

		int n = nextInt();

		int[] lowestPrimeFactors = enumLowestPrimeFactors(5000005);

		StringBuilder str = new StringBuilder();
		int[] count = new int[5000001];
		/*
		 * int cur = 2; while (cur <= 5000000) { if (count[cur] == 0) { for (int
		 * i = cur; i <= 5000000; i += cur) { int temp = i; do { count[i]++;
		 * temp /= cur; } while (temp % cur == 0); } } count[cur] = count[cur] +
		 * count[cur - 1]; cur++;
		 * 
		 * }
		 */
		int sum[] = new int[5000001];
		for (int i = 2; i <= 5000000; ++i) {
			count[i] = count[i / lowestPrimeFactors[i]] + 1;
			sum[i] = count[i] + sum[i - 1];
		}

		for (int i = 0; i < n; ++i) {
			int a = nextInt();
			int b = nextInt();
			str.append(sum[a] - sum[b]);
			str.append('\n');
		}
		System.out.println(str);

	}

	public static int[] enumLowestPrimeFactors(int n) {
		int tot = 0;
		int[] lowestPrimeFactors = new int[n + 1];

		int[] primes = new int[n + 1];
		for (int i = 2; i <= n; i++)
			lowestPrimeFactors[i] = i;
		for (int p = 2; p <= n; p++) {
			if (lowestPrimeFactors[p] == p)
				primes[tot++] = p;
			int tmp;
			for (int i = 0; i < tot && primes[i] <= lowestPrimeFactors[p]
					&& (tmp = primes[i] * p) <= n; i++) {
				lowestPrimeFactors[tmp] = primes[i];
			}
		}
		return lowestPrimeFactors;
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

	static Integer nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	static Double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}
}
