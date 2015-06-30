import java.util.Scanner;

public class A147 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] number = in.next().toCharArray();
		int sumFirstHalf = 0;
		int sum = 0;
		for (int i = 0; i < n; ++i) {
			if (number[i] != '7' && number[i] != '4') {
				System.out.println("NO");
				return;
			}

			if (i < (n >> 1)) {
				sumFirstHalf += number[i] - '0';
			}
			sum += number[i] - '0';
		}

		System.out.println((sumFirstHalf << 1) == sum ? "YES" : "NO");

	}
}
