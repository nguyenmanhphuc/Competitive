import java.util.Arrays;
import java.util.Scanner;

public class B137 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		boolean[] p = new boolean[n + 1];
		for (int i = 0; i < n; ++i) {
			int next = in.nextInt();
			if (next > n) {
				count++;
				continue;
			}
			if (p[next]) {
				count++;
			}
			p[next] = true;
		}

		System.out.println(count);

	}
}
