import java.util.Arrays;
import java.util.Scanner;

public class B441 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int v = in.nextInt();
		int[] days = new int[3002];
		for (int i = 0; i < n; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			days[a] += b;
		}
		long max = 0;
		for (int i = 1; i <= 3001; ++i) {
			int left = v;
			max += Math.min(days[i - 1], left);
			left -= Math.min(days[i - 1], left);
			max += Math.min(days[i], left);
			days[i] -= Math.min(days[i], left);
		}
		
		
		System.out.println(max);

	}
}
