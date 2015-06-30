import java.util.Scanner;

public class A426 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = in.nextInt();
		int max = 0;
		int sum = 0;
		for (int i = 0; i < n; ++i) {

			int temp = in.nextInt();
			max = Math.max(max, temp);
			sum += temp;
		}

		if (sum - max <= s) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
