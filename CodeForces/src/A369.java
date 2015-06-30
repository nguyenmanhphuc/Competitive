import java.util.Scanner;

public class A369 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		int count = 0;
		for (int i = 0; i < n; ++i) {
			int t = in.nextInt();
			if (t == 1) {
				if (m == 0) {
					count++;
				} else {
					m--;
				}
			} else {
				if (k > 0) {
					k--;
				} else if (m > 0) {
					m--;
				} else {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
