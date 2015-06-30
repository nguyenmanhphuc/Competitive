import java.util.Scanner;

public class E166 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long result = 1;
		long way = 1;
		long MOD = (long) (1e9 + 7);
		for (int i = 0; i < n; ++i) {
			result = result * 3 + ((way - result) * 2);
			way *= 3;
			result = (way - result) % MOD;
			way %= MOD;
			if (result < 0)
				result += MOD;
		}
		System.out.println(result);
	}

}
