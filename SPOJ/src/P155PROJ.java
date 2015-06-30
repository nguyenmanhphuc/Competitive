import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class P155PROJ {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		int n = nextInt();
		int m = nextInt();
		int v = nextInt();

		List<Integer> less[] = new List[n + 1];
		List<Integer> eq[] = new List[n + 1];

		for (int i = 1; i <= n; ++i) {
			less[i] = new ArrayList<>();
			eq[i] = new ArrayList<>();
		}

		int[] w = new int[n + 1];
		for(int i = 0; i<v; ++i){
			int a = nextInt();
			String s = nextString();
			int b = nextInt();
			if(s.equals("=")){
				eq[b].add(a);
			}
		}
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
