import java.util.Scanner;

public class C489 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = in.nextInt();

		if (n > 1 && s == 0) {
			System.out.println("-1 -1");
			return;
		}
		if (n * 9 < s) {
			System.out.println("-1 -1");
			return;
		}

		StringBuilder max = new StringBuilder();
		StringBuilder min = new StringBuilder();
		int maxLeft = s;
		int minLeft = s;

		int maxFirstDigit = Math.min(9, s);
		max.append(maxFirstDigit);
		maxLeft -= maxFirstDigit;
		int minDigit = Math.max(1, s - (n - 1) * 9);
		if (minDigit > s) {
			minDigit = s;
		}
		min.append(minDigit);
		minLeft -= minDigit;

		for (int i = 1; i < n; ++i) {
			max.append(Math.min(9, maxLeft));
			maxLeft -= Math.min(9, maxLeft);

			minDigit = Math.max(0, minLeft - (n - i - 1) * 9);
			if (minDigit > minLeft) {
				minDigit = minLeft;
			}
			min.append(minDigit);
			minLeft -= minDigit;
		}
		System.out.println(min.toString() + " " + max.toString());
	}
}
