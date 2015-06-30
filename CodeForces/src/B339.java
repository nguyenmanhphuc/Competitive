import java.util.Scanner;

public class B339 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		long sum = 0;
		int cur = 1;
		for (int i = 0; i < m; ++i) {
			int temp = in.nextInt();
			if (temp < cur) {
				sum += temp + n - cur;
			} else {
				sum += temp - cur;
			}
			cur = temp;
		}
		System.out.println(sum);

	}

}
