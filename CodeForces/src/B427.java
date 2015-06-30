import java.util.Scanner;

public class B427 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int c = in.nextInt();
		long result = 0;
		int count = 0;
		for (int i = 0; i < n; ++i) {
			int temp = in.nextInt();
			if (temp <= t) {
				count++;
			} else {
				if (count >= c) {
					result += count - c + 1;
				}
				count = 0;
			}

		}
		if (count >= c) {
			result += count - c + 1;
		}

		System.out.println(result);

	}

}
