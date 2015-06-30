import java.util.Scanner;

public class AMSSEQ {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int arr[] = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			arr[i] = in.nextInt();
		}
		int z[] = new int[n + 1];
		int max = 0;
		for (int i = 1; i <= n; ++i) {
			int t = i - k < 0 ? 0 : i - k;
			z[i] = z[t];
			for (t = t + 1; t < i; ++t) {
				z[i] = Math.max(z[i], z[t]);
			}
			z[i] += arr[i];
			max = Math.max(max, z[i]);
		}

		System.out.println(max);

	}
}
