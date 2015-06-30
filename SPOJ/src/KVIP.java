import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KVIP {

	public static void main(String[] args) {
		int n = nextInt();
		long arr[][] = new long[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = nextLong();
			}
		}
		long f[] = new long[n];
		f[0] = 0;
		for (int i = 1; i < n; ++i) {
			long max = Integer.MIN_VALUE;
			for (int j = 0; j < i; ++j) {
				max = Math.max(max, f[j] - arr[j][0] + arr[j][i] + arr[i][0]
						- arr[i][i]);
			}
			f[i] = max;
		}
		long sum = 0;
		long max = 0;
		for (int i = 0; i < n; ++i) {
			sum += arr[i][i];
			max = Math.max(max, f[i]);
		}
		System.out.println(sum + max);
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
	
	public static long nextLong() {
		return Long.parseLong(nextString());
	}
}
