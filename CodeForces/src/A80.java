import java.util.Arrays;
import java.util.Scanner;

public class A80 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] primes = generatePrimesLinear(50);

		int n = in.nextInt();
		int m = in.nextInt();
		int index = Arrays.binarySearch(primes, n);
		int mIndex = Arrays.binarySearch(primes, m);
		if ((mIndex >= 0 && mIndex == index + 1)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
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
