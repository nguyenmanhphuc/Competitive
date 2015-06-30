import java.util.Scanner;

public class A288 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		if (k > n || (n > 1 && k == 1)) {
			System.out.println(-1);
			return;
		}

		if (n == 1) {
			System.out.println('a');
			return;
		}
		StringBuilder str = new StringBuilder();
		int left = n - k + 2;
		for (int i = 0; i < left; ++i) {
			if ((i & 1) == 0) {
				str.append('a');
			} else {
				str.append('b');
			}
		}
		char c = 'c';
		for (int i = left; i < n; ++i) {
			str.append(c);
			c++;
		}
		System.out.println(str);
	}
}
