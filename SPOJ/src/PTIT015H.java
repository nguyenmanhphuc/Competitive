import java.util.Scanner;

public class PTIT015H {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; ++i) {
			long n = in.nextLong();

			System.out.println(solve(n));
		}

		/*
		 * for (int i = 30000; i < 50000; ++i) { //System.out.println(solve(i));
		 * if (naiveSolve(i) != solve(i)) { System.out.println(i + " " +
		 * naiveSolve(i) + " " + solve(i));
		 * 
		 * } }
		 */

	}

	static int naiveSolve(long n) {
		StringBuilder str = new StringBuilder();
		for (int i = 1; i <= n; ++i) {
			str.append(i);
		}

		char[] s = str.toString().toCharArray();
		int length = s.length;
		boolean oddTurn = true;
		while (length > 1) {
			int index = 0;
			if (oddTurn) {
				for (int i = 0; i < length; i += 2) {
					s[index++] = s[i];
				}

				oddTurn = false;
			} else {
				for (int i = 1; i < length; i += 2) {
					s[index++] = s[i];
				}
				oddTurn = true;
			}
			length = index;
		}
		return s[0] - '0';
	}

	private static int solve(long n) {
		long length = countLength(n);
		long pos = location(length);

		length = 0;
		int numDigit = 1;
		long pow = 1;
		while (length < pos) {
			length += pow * numDigit * 9;
			pow *= 10;
			numDigit++;
		}
		// System.out.println(pos);
		pow /= 10;
		numDigit--;
		length -= pow * numDigit * 9;
		long left = pos - length;
		long cur = (left + numDigit - 1) / numDigit + pow - 1;
		int mod = (int) (left % numDigit);
		if (mod == 0) {

			return (int) (cur % 10);
		} else {
			char[] s = (cur + "").toCharArray();
			return s[mod - 1] - '0';
		}
	}

	private static long location(long length) {
		long pos = length;
		int count = 0;
		while (pos > 1) {
			if ((count & 1) == 0) {
				pos -= pos >> 1;
			} else {
				pos -= (pos + 1) >> 1;
			}
			count++;
		}

		while (count > 0) {
			if ((count & 1) == 1) {
				pos += pos - 1;
			} else {
				pos += pos;
			}
			count--;
		}
		return pos;
	}

	private static long countLength(long n) {
		long result = 0;
		int length = (n + "").length();
		int pow = 1;
		for (int i = 1; i < length; ++i) {
			result += pow * i * 9;
			pow *= 10;
		}
		result += (n - pow + 1) * length;

		return result;
	}
}
