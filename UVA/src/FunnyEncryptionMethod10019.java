import java.util.Scanner;

public class FunnyEncryptionMethod10019 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int b1 = getCount(n, 2);
			int b2 = getCount(n);
			System.out.println(b1 + " " + b2);
		}

	}

	private static int getCount(int n) {
		int count = 0;
		while (n > 0) {
			int d = n % 10;
			n /= 10;
			count += getCount(d, 2);
		}

		return count;
	}

	private static int getCount(int n, int i) {
		int count = 0;
		while (n > 0) {
			count += n & 1;
			n = n >> 1;
		}
		return count;
	}

}
