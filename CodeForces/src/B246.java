import java.util.Scanner;

public class B246 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		for (int i = 0; i < n; ++i) {
			sum += in.nextInt();
		}

		if (sum % n == 0 || n == 1) {
			System.out.println(n);
		} else {
			System.out.println(n - 1);
		}

	}

}
