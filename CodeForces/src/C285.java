import java.util.Arrays;
import java.util.Scanner;

public class C285 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] p = new Integer[n];
		for (int i = 0; i < n; ++i) {
			p[i] = in.nextInt();

		}
		long result = 0;
		Arrays.sort(p);
		for (int i = 0; i < n; ++i) {
			result += Math.abs((i + 1) - p[i]);
		}
		
		System.out.println(result);
	}

}
