import java.util.Scanner;

public class B550 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int left = in.nextInt();
		int right = in.nextInt();
		int x = in.nextInt();
		long problems[] = new long[n];
		for (int i = 0; i < n; ++i) {
			problems[i] = in.nextLong();
		}

		int count = 0;
		int limit = 1 << n;
		for (int i = 2; i < limit; ++i) {
			int temp = i;
			long min = Integer.MAX_VALUE;
			long max = Integer.MIN_VALUE;
			long sum = 0;
			int countPro = 0;
			for (int j = 0; j < n; ++j) {
				int t = temp & 1;
				if (t == 1) {
					min = Math.min(min, problems[j]);
					max = Math.max(max, problems[j]);
					sum += problems[j];
					countPro++;
				}
				temp = temp >> 1;
			}
			long diff = max - min;
			if ( countPro>=2&&   diff >= x && sum >= left && sum <= right) {
				count++;
			}
		}
		System.out.println(count);

	}
}
