import java.util.Arrays;
import java.util.Scanner;

public class B327 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		int[] primes = generatePrimesLinear(1400000);
		//System.out.println(primes.length);
		int n = in.nextInt();
		for (int i = 0; i < n; ++i) {
			if (i > 0) {
				str.append(' ');
			}
			str.append(primes[i]);
		}
		System.out.println(str);

	}

	public static int[] generatePrimesLinear(int n) {
		int[] lp = new int[n + 1];
		int[] primes = new int[n + 1];
		int cnt = 0;
		for (int i = 2; i <= n; ++i) {
			if (lp[i] == 0) {
				lp[i] = i;
				primes[cnt++] = i;
			}
			for (int j = 0; j < cnt && primes[j] <= lp[i] && i * primes[j] <= n; ++j)
				lp[i * primes[j]] = primes[j];
		}
		return Arrays.copyOf(primes, cnt);
	}
}
