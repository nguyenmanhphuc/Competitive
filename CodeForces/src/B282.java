import java.util.Scanner;

public class B282 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = 0;
		int k = 0;
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (Math.abs(m + a - k) <= 500) {
				str.append('A');
				m += a;
			} else {
				str.append('G');
				k += b;
			}
		}
		if (Math.abs(m - k) <= 500) {
			System.out.println(str);
		} else {
			System.out.println(-1);
		}

	}

}
