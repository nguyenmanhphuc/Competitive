import java.util.Scanner;

public class A215 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		int max = -1;
		int n = in.nextInt();

		int axle[] = new int[n];

		for (int i = 0; i < n; ++i) {
			axle[i] = in.nextInt();
		}
		int m = in.nextInt();
		int wheelAxle[] = new int[m];
		for (int j = 0; j < m; ++j) {
			wheelAxle[j] = in.nextInt();
		}
		for (int i = 0; i < n; ++i) {
			for (int j = m - 1; j >= 0; --j) {
				if (wheelAxle[j] % axle[i] == 0) {
					int ratio = wheelAxle[j] / axle[i];
					if (ratio > max) {
						max = ratio;
						count = 1;
					} else if (ratio == max) {
						count++;
					}
					break;
				}
			}
		}
		System.out.println(count);

	}

}
