import java.util.Scanner;

public class A352 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count5 = 0;
		int count0 = 0;
		for (int i = 0; i < n; ++i) {
			if (in.nextInt() == 5) {
				count5++;
			} else {
				count0++;
			}
		}

		if (count0 == 0) {
			System.out.println(-1);
		} else if (count5 < 9) {
			System.out.println(0);
		} else {
			count5 = count5 / 9 * 9;
			for (int i = 0; i < count5; ++i) {
				System.out.print(5);
			}

			for (int i = 0; i < count0; ++i) {
				System.out.print(0);
			}
			System.out.println();
		}

	}

}
