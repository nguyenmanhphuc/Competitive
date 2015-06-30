import java.util.Scanner;

public class A408 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int queueLengths[] = new int[n];
		long min = Long.MAX_VALUE;
		for (int i = 0; i < n; ++i) {
			queueLengths[i] = in.nextInt();
		}

		for (int i = 0; i < n; ++i) {
			long cur = 0;
			for (int j = 0; j < queueLengths[i]; ++j) {
				cur += in.nextLong();
			}
			cur = cur * 5 + queueLengths[i] * 15;
			min = Math.min(min, cur);
		}
		System.out.println(min);

	}
}
