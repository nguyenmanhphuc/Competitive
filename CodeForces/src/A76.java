import java.util.Scanner;

public class A76 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long x[] = new long[n];
		long y[] = new long[n];
		long result = 0;
		int temp = n - 1;
		long sumX = 0;
		long sumY = 0;
		for (int i = 0; i < n; ++i) {
			x[i] = in.nextLong();
			y[i] = in.nextLong();
			result += temp * (x[i] * x[i] +   y[i] * y[i]);
			sumX += x[i];
			sumY += y[i];
		}

		for (int i = 0; i < n; ++i) {
			result -= x[i] * (sumX - x[i]);
			result -= y[i] * (sumY - y[i]);
		}
		
		System.out.println(result);

	}
}
