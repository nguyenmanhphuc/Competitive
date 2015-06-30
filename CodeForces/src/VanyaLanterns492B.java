import java.util.Arrays;
import java.util.Scanner;

public class VanyaLanterns492B {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int l = in.nextInt();
		Integer[] points = new Integer[n];

		for (int i = 0; i < n; ++i) {
			points[i] = in.nextInt();
		}
		Arrays.sort(points);
		double result = 0;
		for (int i = 1; i < n; ++i) {
			result = Math.max(result, (points[i] - points[i - 1]) / 2.0);
		}
		result = Math.max(result, points[0]);
		result = Math.max(result, l - points[n - 1]);
		System.out.println(result);
	}
}
