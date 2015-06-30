import java.util.Scanner;

public class A272 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long sum = 0;
		for (int i = 0; i < n; ++i) {
			sum += in.nextLong();
		}

		int result = 5;
		for (int i = 1; i <= 5; ++i) {
			if ((sum + i) % (n + 1) == 1) {
				result--;
			}
		}
		System.out.println(result);

	}

}
