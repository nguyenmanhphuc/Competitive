import java.util.Scanner;

public class C513 {

	static int low[];
	static int high[];
	static int n;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		low = new int[n];
		high = new int[n];

		int min = 100000;
		int max = 0;
		for (int i = 0; i < n; ++i) {
			low[i] = in.nextInt();
			min = Math.min(min, low[i]);
			high[i] = in.nextInt();
			max = Math.max(max, high[i]);
		}
		double result = 0;

		for (int bid = min; bid <= max; ++bid) {
			double a = lowerProbability(low[0], high[0], bid);
			; // all smaller
			double b = equalProbability(low[0], high[0], bid); // no more, one
																// equal
			double e = 0; // no more, at least two equal
			double c = higherProbability(low[0], high[0], bid); // have one
																// more, no
																// equal
			double d = 0; // have one more, have at least one equal

			for (int i = 1; i < n; ++i) {
				double lower = lowerProbability(low[i], high[i], bid);
				double equal = equalProbability(low[i], high[i], bid);
				double higher = higherProbability(low[i], high[i], bid);

				double a1 = a * lower;
				double b1 = a * equal + b * lower;
				double e1 = e * (lower + equal) + b * equal;

				double c1 = c * lower + a * higher;
				double d1 = d * (lower + equal) + c * equal + e * higher + b
						* higher;
				a = a1;
				b = b1;
				c = c1;
				e = e1;
				d = d1;

			}
			result += bid * d + e * bid;

		}
		System.out.println(result);

	}

	private static double lowerProbability(int low, int high, int bid) {
		if (bid > high) {
			return 1;
		} else if (bid <= low) {
			return 0;
		}
		return (bid - low) / (high - low + 1.0);
	}

	private static double higherProbability(int low, int high, int bid) {
		if (bid >= high) {
			return 0;
		} else if (bid < low) {
			return 1;
		}
		return (high - bid) / (high - low + 1.0);
	}

	private static double equalProbability(int low, int high, int bid) {
		if (bid > high) {
			return 0;
		} else if (bid < low) {
			return 0;
		}
		return 1 / (high - low + 1.0);
	}
}
