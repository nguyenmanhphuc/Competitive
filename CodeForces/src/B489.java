import java.util.Scanner;

public class B489 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] boys = new int[102];
		for (int i = 0; i < n; ++i) {
			boys[in.nextInt()]++;
		}

		int m = in.nextInt();
		int[] girls = new int[102];
		for (int i = 0; i < m; ++i) {
			girls[in.nextInt()]++;
		}

		int count = 0;
		for (int i = 1; i <= 100; ++i) {
			int min = Math.min(boys[i], girls[i - 1]);
			boys[i] -= min;
			count += min;
			girls[i - 1] -= min;

			min = Math.min(boys[i], girls[i]);
			boys[i] -= min;
			count += min;
			girls[i] -= min;

			min = Math.min(boys[i], girls[i + 1]);
			boys[i] -= min;
			count += min;
			girls[i + 1] -= min;
		}

		System.out.println(count);

	}
}
