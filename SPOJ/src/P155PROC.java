import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class P155PROC {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		is = System.in;
		long pow2[] = new long[1001];
		pow2[0] = 1;
		for (int i = 1; i <= 1000; ++i) {
			pow2[i] = (pow2[i - 1] << 1) % 1000000007;
		}

		long arr[][] = new long[1001][1001];
		arr[1][1] = 1;
		arr[2][1] = 3;
		arr[2][2] = 1;
		long start = System.currentTimeMillis();
		
		for (int i = 3; i <= 1000; ++i) {
			for (int j = 1; j < i - 1; ++j) {
				arr[i][j] = (arr[i - 1][j] << 1);
				int left = i - j - 1;
				if (left >= j) {
					arr[i][j] += pow2[left] - arr[left][j];
				}else{
					arr[i][j] += pow2[left];
				}
				if (arr[i][j] < 0) {
					arr[i][j] += 1000000007;
				}
				arr[i][j] %= 1000000007;
			}
			arr[i][i - 1] = 3;
			arr[i][i] = 1;
		}
		
		StringBuilder str = new StringBuilder();
		int t = ni();
		//StringBuilder str = new StringBuilder();
		for (int i = 0; i < t; ++i) {
			str.append(arr[ni()][ni()]);
			str.append('\n');
		}
		System.out.print(str);
		
		/* for (int i = 0; i < 1000000; ++i) {
	            str.append(99999999);
	            str.append('\n');
	        }
	        System.out.print(str);
		System.out.println(System.currentTimeMillis()-start);*/
	}
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	static byte[] inbuf = new byte[4096];
	static int lenbuf = 0, ptrbuf = 0;

	static int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}

	static boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	static int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	static double nd() {
		return Double.parseDouble(ns());
	}

	static char nc() {
		return (char) skip();
	}

	static String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	static char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	static char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	static int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	static long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
}
