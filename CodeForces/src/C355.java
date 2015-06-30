import java.util.Scanner;

public class C355 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long l = in.nextLong();
		long r = in.nextLong();
		long Q1 = in.nextLong();
		long Q2 = in.nextLong();
		long items[] = new long[n];
		long sumWeights = 0;
		for (int i = 0; i < n; ++i) {
			items[i] = in.nextLong();
			sumWeights += items[i];
		}
		long min = (n - 1) * Q2 + (sumWeights) * r;
		long sumLeft = 0;
		for (int i = 0; i < n; ++i) {
			sumLeft += items[i];
			long temp = sumLeft * l + (sumWeights - sumLeft) * r;
			int itemRight = n - i - 1;

			int diff = itemRight - i - 1;
			if (Math.abs(diff) <= 1) {
				min = Math.min(temp, min);
				continue;
			}

			if (diff > 1) {
				temp += (diff - 1) * Q2;
			} else {
				temp += (-diff - 1) * Q1;
			}
			min = Math.min(temp, min);
		}

		min = Math.min(min,(n - 1) * Q1 + (sumWeights) * l);
		System.out.println(min);

	}
}
