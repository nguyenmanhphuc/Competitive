import java.util.Scanner;

public class A268 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int host[] = new int[101];
		int guest[] = new int[101];

		for (int i = 0; i < n; ++i) {
			int h = in.nextInt();
			int g = in.nextInt();
			host[h]++;
			guest[g]++;
		}

		int count = 0;

		for (int i = 1; i <= 100; ++i) {
			if (host[i] > 0) {
				count += guest[i] * host[i];
			}

		}
		System.out.println(count);
	}
}
