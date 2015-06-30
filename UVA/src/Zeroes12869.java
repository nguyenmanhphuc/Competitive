import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

class Zeroes12869 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger left = in.nextBigInteger();
		BigInteger right = in.nextBigInteger();
		StringBuilder str = new StringBuilder();
		while (!left.equals(BigInteger.valueOf(0))
				|| !right.equals(BigInteger.valueOf(0))) {
			BigInteger t = left.divide(BigInteger.valueOf(5));
			BigInteger h = right.divide(BigInteger.valueOf(5));
			str.append(h.subtract(t).add(BigInteger.valueOf(1)));
			str.append("\n");
			left = in.nextBigInteger();
			right = in.nextBigInteger();
		}
		System.out.print(str);

	}
	
	public static InputStream in = System.in;
	public static byte[] bytes = new byte[3000];
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
