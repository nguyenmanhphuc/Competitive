import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class BONUS {

	public static void main(String[] args) {
		int n = nextInt();
		int k = nextInt();
		int arr[][] = new int[n + 1][n + 1];
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n; ++j) {
				int value = nextInt();
				arr[i][j] = value;
				arr[i][j] += arr[i][j - 1] + arr[i - 1][j] - arr[i - 1][j - 1];
			}
		}
		int max = Integer.MIN_VALUE;
		for (int i = k; i <= n; ++i) {
			for (int j = k; j <= n; ++j) {
				int cur = arr[i][j] - arr[i][j - k] - arr[i - k][j]
						+ arr[i - k][j - k];
				if (cur > max) {
					max = cur;
				}
			}
		}
		System.out.println(max);
	}

	public static InputStream in = System.in;
	public static byte[] bytes = new byte[3072];
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
