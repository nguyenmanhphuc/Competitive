import java.util.Scanner;

public class A289 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int sum = 0;
		for (int i = 0; i < n; ++i) {
			int left = in.nextInt();
			int right = in.nextInt();
			sum += right - left + 1;
		}

		int mod = sum % k;
		System.out.println(mod == 0 ? mod : k - mod);

	}
}
