import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class SKWLTH {

	
	public static void main(String[] args) {
		solve();
	

	}
	
	public void solveLinear() {
		int n = nextInt();
		short dis[] = new short[n];
		short z[] = new short[30001];
		for (int i = 0; i < n; ++i) {
			dis[i] = nextShort();
			z[dis[i]] = 1;
			short h = nextShort();
		}
		short level = 0;
		for (int i = 0; i <= 30000; ++i) {
			if (z[i] == 1) {
				level++;
				z[i] = level;
			}
		}

		for (int i = 0; i < n; ++i) {
			System.out.println(z[dis[i]]);

		}

	}

	// NlogN
	public static void solve() {
		int n = nextInt();
		List<House> houses = new ArrayList<House>();
		for (short i = 0; i < n; ++i) {
			houses.add(new House(nextShort(), nextShort(), i));
		}
		Collections.sort(houses);
		short result[] = new short[n];
		short currentLevel = 1;
		n--;
		for (short i = 0; i <= n; ++i) {
			result[houses.get(i).id] = currentLevel;
			if (i <= n - 1 && houses.get(i).compareTo(houses.get(i + 1)) < 0) {
				currentLevel++;
			}
		}
		StringBuilder str = new StringBuilder();
		for (int i = 0; i <= n; ++i) {
			str.append(result[i]);
			str.append("\n");
		}
		System.out.print(str);
	}

	public static InputStream in = System.in;
	public static byte[] bytes = new byte[2048];
	public static int lenbuf = 0;
	public static int ptrbuf = 0;

	public static int readByte() {
		if (lenbuf == -1) {
			throw new InputMismatchException();
		}
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = in.read(bytes);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new InputMismatchException();
			}
			if (lenbuf <= 0) {
				return -1;
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

	public static short nextShort() {
		return Short.parseShort(nextString());
	}

}

class House implements Comparable<House> {
	short d;
	short store;
	short id;

	public House(short a, short b, short c) {
		d = a;
		store = b;
		id = c;
	}

	@Override
	public int compareTo(House a) {
		if (d < a.d && store > a.store) {
			return -1;
		} else if (d > a.d && store < a.store) {
			return 1;
		}
		return 0;
	}
}
