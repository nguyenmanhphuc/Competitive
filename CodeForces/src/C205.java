import java.util.Scanner;

public class C205 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long left = in.nextLong();
		long right = in.nextLong();
		long r = cal(right);
		long l = cal(left - 1);
		System.out.println((r - l));
	}

	private static long cal(long l) {
		if (l < 10) {
			return l;
		}
		char[] digits = (l + "").toCharArray();
		int first = digits[0];
		int length = digits.length;
		int last = digits[length - 1];
		long mid = 0;
		for (int i = 1; i < length - 1; ++i) {
			mid = mid * 10 + digits[i] - '0';
		}
		long result = 0;
		if (first > last) {
			result--;
		}

		result += mid + 1;
		long m = 1;
		for (int i = 0; i < length - 2; ++i) {
			m *= 10;
		}
		result += (first - '0' - 1) * m;

		long k = 0;
		if (length >= 2) {
			k++;
		}
		long t = 1;
		for (int i = 2; i < length; ++i) {
			k += t;
			t *= 10;
		}

		k *= 9;
		result += k;
		return result;
	}
}
