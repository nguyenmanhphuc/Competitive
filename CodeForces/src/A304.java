import java.util.Scanner;

public class A304 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		for (int i = 1; i <= n; ++i) {
			int z = i * i;
			for (int j = i; j <= n; ++j) {
				int sum = z + j * j;
				int t = (int) Math.sqrt(sum);
				if (t * t == sum && t <= n) {
					count++;
				}

				if (t > n) {
					break;
				}
			}
		}
		System.out.println(count);
	}

}
