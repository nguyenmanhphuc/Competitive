import java.math.BigInteger;
import java.util.Scanner;

public class P153PROB {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		BigInteger[] ints = new BigInteger[n + 1];
		ints[0] = BigInteger.valueOf(1);
		ints[1] = BigInteger.valueOf(1);

		for (int i = 2; i <= n; ++i) {
			ints[i] = ints[i - 1].multiply(BigInteger.valueOf(4 * n - 2))
					.divide(BigInteger.valueOf(n + 1));
		}

		BigInteger result = BigInteger.valueOf(0);
		for (int i = 0; i <= n; ++i) {
			result = result.add(ints[i].multiply(ints[n - i]));
		}
		System.out.println(result.toString());

	}
}
