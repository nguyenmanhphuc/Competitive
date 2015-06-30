import java.util.ArrayList;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */
public class K100694 {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskE solver = new TaskE();
		solver.solve(1, in, out);
		out.close();
	}
}

class TaskE {
	public void solve(int testNumber, InputReader in, PrintWriter out) {
		int n = in.nextInt();
		long left = 0;
		long lefTTT = 1;
		long right = 1;
		long righTTT = 1;
		long A = in.nextLong();
		long B = in.nextLong();

		long preX = Math.max(A, B);

		long preY = Math.min(A, B);
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 1; i < n; ++i) {
			A = in.nextLong();
			B = in.nextLong();

			long X = Math.max(A, B);
			long Y = Math.min(A, B);
			long Z = (preX - X) - (preY - Y);
			long K = Y - preY;
			if (Z == 0) {
				if (K <= 0) {
					preX = X;
					preY = Y;
					continue;
				}
				writer.println("NO");
				writer.close();
				return;
			}

			if (Z > 0) {

				if (K * righTTT > right * Z) {
					writer.println("NO");
					writer.close();
					return;
				}

				preX = X;
				preY = Y;

				if (left * Z < lefTTT * K) {
					left = K;
					lefTTT = Z;
				}

			} else {
				if (K > 0) {
					writer.println("NO");
					writer.close();
					return;
				}

				if (K * lefTTT > left * Z) {
					writer.println("NO");
					writer.close();
					return;
				}

				preX = X;
				preY = Y;
				if (right * Z < righTTT * K) {
					right = -K;
					righTTT = -Z;
				}
			}
		}

		writer.println("YES");
		writer.close();

	}
}

class InputReader {
	public BufferedReader reader;
	public StringTokenizer tokenizer;

	public InputReader(InputStream stream) {
		reader = new BufferedReader(new InputStreamReader(stream), 32768);
		tokenizer = null;
	}

	public String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}
}