import java.util.Scanner;

public class C476 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();

		long MOD = (long) 1e9 + 7;
		long result = ((b - 1) * b / 2) % MOD
				* ((a + 1) * (a) / 2 % MOD * b % MOD + a);
		System.out.println(result % MOD);

	}

}
