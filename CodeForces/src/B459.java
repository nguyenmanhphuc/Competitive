import java.util.Scanner;

public class B459 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int min = Integer.MAX_VALUE;
		int max = 0;
		long countMin = 0;
		long countMax = 0;
		for (int i = 0; i < n; ++i) {
			int beauty = in.nextInt();
			if (beauty < min) {
				min = beauty;
				countMin = 1;
			} else if (beauty == min) {
				countMin++;
			}

			if (beauty > max) {
				max = beauty;
				countMax = 1;
			} else if (beauty == max) {
				countMax++;
			}
		}
		if (max == min) {
			System.out.println(0 + " " + (countMax) * (countMax - 1) / 2);
			return;
		}

		System.out.println((max - min) + " " + (countMax * countMin));

	}
}
