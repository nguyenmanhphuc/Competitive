import java.util.Scanner;

public class A449 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		long m = in.nextInt();
		long k = in.nextInt();

		if (k > (n + m - 2)) {
			System.out.println("-1");
			return;
		}

		long max = Math.max(n, m);
		long min = Math.min(n, m);
		long t = Math.min(k, max - 1);

		long result = max / (t + 1) * (min / (k - t + 1));

		t = Math.min(k, min - 1);
		result = Math.max(result, min / (t + 1) * (max / (k - t + 1)));
		System.out.println(result);
	}

}
