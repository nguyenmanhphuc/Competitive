import java.util.Scanner;

public class A353 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sumUpper = 0;
		int sumlower = 0;
		boolean pos = false;
		for (int i = 0; i < n; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			sumUpper += a;
			sumlower += b;
			if ((a + b) % 2 == 1) {
				pos = true;
			}
		}

		if ((sumlower + sumUpper) % 2 == 1 || (!pos & sumlower % 2 == 1)) {
			System.out.println(-1);
			return;
		}

		if (sumlower % 2 == 1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
