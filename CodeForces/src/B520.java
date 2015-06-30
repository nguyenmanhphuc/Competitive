import java.util.Scanner;

public class B520 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int result = 0;
		while (n < m) {
			if ((m & 1) > 0) {
				result++;
			}
			m = (m + 1) >> 1;
			result++;
		}

		result += n - m;
		System.out.println(result);
	}
}
