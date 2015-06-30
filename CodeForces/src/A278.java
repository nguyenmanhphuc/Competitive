import java.util.Scanner;

public class A278 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ds = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			ds[i] = ds[i - 1] + in.nextInt();
		}
		int s = in.nextInt();
		int t = in.nextInt();
		if (s < t) {
			int d1 = ds[t - 1] - ds[s - 1];
			System.out.println(Math.min(d1, ds[n] - d1));
		} else {
			int d1 = ds[s - 1] - ds[t - 1];
			System.out.println(Math.min(d1, ds[n] - d1));
		}

	}
}
