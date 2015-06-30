import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Stack;

public class TREAT {
	static Stack<Integer> stack;
	static int time;
	static int[] lowlink;

	static int result[];
	static int nexts[];

	public static void main(String[] args) {
		int n = nextInt();
		result = new int[n + 1];
		nexts = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			nexts[i] = nextInt();
		}
		lowlink = new int[n + 1];
		stack = new Stack<Integer>();
		for (int i = 1; i <= n; ++i) {
			if (result[i] == 0) {
				dfs(1, i);
			}
		}

		StringBuilder str = new StringBuilder();
		for (int i = 1; i <= n; ++i) {
			str.append(result[i]);
			str.append('\n');
		}
		System.out.print(str);
	}

	private static void dfs(int time, int i) {
		lowlink[i] = time++;
		int size = stack.size();
		if (nexts[i] == i) {
			int t = 1;
			result[i] = t++;
			while (size-- > 0) {
				result[stack.pop()] = t++;
			}
			return;
		}

		if (result[nexts[i]] != 0) {
			int t = result[nexts[i]];
			result[i] = ++t;

			while (size-- > 0) {
				result[stack.pop()] = ++t;
			}
		} else if (lowlink[nexts[i]] != 0) {
			int t = time - lowlink[nexts[i]];
			int z = nexts[i];
			result[i] = t;
			int p = i;
			while (size-- > 0 && p != z) {
				p = stack.pop();
				result[p] = t;
			}
			while (size-- > 0) {
				result[stack.pop()] = ++t;
			}
		} else {
			stack.add(i);
			dfs(time, nexts[i]);
		}
	}

	public static InputStream in = System.in;
	public static byte[] bytes = new byte[2048];
	public static int lenbuf = 0;
	public static int ptrbuf = 0;

	public static int readByte() {
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = in.read(bytes);
			} catch (IOException e) {
				throw new InputMismatchException();
			}

		}

		return bytes[ptrbuf++];
	}

	public static boolean isSpace(int b) {
		return !(b >= 33 && b <= 126);
	}

	public static int read() {
		int b;
		while ((b = readByte()) != -1 && isSpace(b))
			;
		return b;
	}

	public static String nextString() {
		StringBuilder str = new StringBuilder();

		int b = read();
		while (!isSpace(b)) {
			str.appendCodePoint(b);
			b = readByte();
		}

		return str.toString();
	}

	public static int nextInt() {
		return Integer.parseInt(nextString());
	}
}
