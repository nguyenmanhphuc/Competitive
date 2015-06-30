import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//Incorrect
public class D556 {

	public static void main(String[] args) throws IOException {
		initReader();
		int n = nextInt();
		int m = nextInt();
		if (m < n - 1) {
			System.out.println("No");
			return;
		}
		B[] bs = new B[n - 1];
		long preX = nextLong();
		long preY = nextLong();
		for (int i = 1; i < n; ++i) {
			long x = nextLong();
			long y = nextLong();
			long need = x - preY;
			bs[i - 1] = new B();
			bs[i - 1].IS = i;
			bs[i - 1].min = need;
			bs[i - 1].max = y - preX;
			preY = y;
			preX = x;
		}

		T[] br = new T[m];
		for (int i = 0; i < m; ++i) {
			br[i] = new T();
			br[i].index = i + 1;
			br[i].length = nextLong();
		}

		Arrays.sort(br, new Comparator<T>() {

			@Override
			public int compare(T t1, T t2) {
				return Long.compare(t1.length, t2.length);
			}
		});

		Arrays.sort(bs, new Comparator<B>() {

			@Override
			public int compare(B b1, B b2) {
				return Long.compare(b1.min, b2.min);

			}
		});

		int[] result = new int[n];
		PriorityQueue<B> q = new PriorityQueue<B>(2,new Comparator<B>() {

			@Override
			public int compare(B b1, B b2) {
				return Long.compare(b1.max, b2.max);
			}
		});

		int index = 0;
		int count = 0;
		for (int i = 0; i < m; ++i) {
			while (index < n - 1 && bs[index].min <= br[i].length) {
				q.add(bs[index++]);
			}

			while (!q.isEmpty() && q.peek().max < br[i].length) {
				q.poll();
			}

			if (q.isEmpty()) {
				continue;

			}
			result[(int) (q.poll().IS - 1)] = (int) br[i].index;
			count++;
		}
		if (count < n - 1) {
			System.out.println("No");
			return;
		}

		PrintWriter writer = new PrintWriter(System.out);
		writer.println("Yes");
		writer.print(result[0]);
		for (int i = 1; i < n - 1; ++i) {
			writer.print(' ');
			writer.print(result[i]);
		}
		writer.close();
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

class B {
	public long IS;
	public long min;
	public long max;
	public long Brige;

}

class T {
	public long length;
	public long index;
}
