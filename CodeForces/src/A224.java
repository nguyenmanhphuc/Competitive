import java.util.Scanner;

public class A224 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		int max = Math.max(k, m);
		int min = Math.min(m, k);
		for (int i = 1; i * i <= n; ++i) {
			if (n % i == 0) {
				int t = n / i;
				if (i * max == t * min) {
					int z = max / t;
					System.out.println((z + t + i) * 4);
					return;
				}
			}
		}

	}

}
