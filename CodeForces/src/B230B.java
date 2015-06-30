import java.util.Arrays;
import java.util.Scanner;

public class B230B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] primes = generatePrimesLinear(1000000);
		for (int i = 0; i < primes.length; ++i) {
			primes[i] *= primes[i];
		}
		for (int i = 0; i < n; ++i) {
			System.out
					.println(Arrays.binarySearch(primes, in.nextLong()) >= 0 ? "YES"
							: "NO");
		}

	}

	public static long[] generatePrimesLinear(int n) {
		long[] lp = new long[n + 1];
		long[] primes = new long[n + 1];
		int cnt = 0;
		for (int i = 2; i <= n; ++i) {
			if (lp[i] == 0) {
				lp[i] = i;
				primes[cnt++] = i;
			}
			for (int j = 0; j < cnt && primes[j] <= lp[i] && i * primes[j] <= n; ++j)
				lp[(int) (i * primes[j])] = primes[j];
		}
		return Arrays.copyOf(primes, cnt);
	}

}
