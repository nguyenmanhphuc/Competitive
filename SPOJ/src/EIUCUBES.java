import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class EIUCUBES {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// long n = in.nextLong();
		// System.out.println(getAnswer(n));
		for (long i = 1000000000000000l; i <= 1000000000111111l; ++i) {
			if (getAnswer1111(i) != getPhiAnswers(i)) {
				System.out.println(i);
			}
		}
	}

	public static long getAnswer1111(long n) {
		long result = (long) Math.pow(6 * n, 1.0 / 3);
		result++;
		if (result * (result + 1) * (result + 2) <= 6 * n) {
			return result;
		}
		result--;
		if (result * (result + 1) * (result + 2) <= 6 * n) {
			return result;
		}
		return result - 1;
	}

	public static long getAnswer1(long n) {
		int need = 1;
		int c = 0;
		long used = 0;
		while (used + need <= n) {
			c++;
			used += need;
			need += c + 1;
		}
		return c;
	}

	public static long getPhiAnswers(long n) {
		long maxHeight = 0;
		for (long i = 1; i * (i + 1) / 2 <= n; ++i) {
			n -= i * (i + 1) / 2;
			++maxHeight;
		}
		return maxHeight;

	}
}
