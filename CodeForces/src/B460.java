import java.util.Scanner;

public class B460 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		int count = 0;
		StringBuilder str = new StringBuilder();
		for (int i = 1; i <= 81; ++i) {
			long x = i;
			for (int j = 2; j <= a; ++j) {
				x *= i;
			}

			x = b * x + c;
			long temp = x;
			int sum = 0;
			while (x > 0) {
				sum += x % 10;
				x /= 10;
			}

			if (sum == i && temp < 1e9) {
				count++;
				if (count > 1) {
					str.append(' ');
				}
				str.append(temp);
			}
		}
		System.out.println(count);
		if (count > 0) {
			System.out.println(str);
		}
	}

}
