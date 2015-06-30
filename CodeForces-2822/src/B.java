import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		if (a == b) {
			System.out.println("infinity");
			return;
		}

		a -= b;
		int count = 0;
		int end = (int) Math.sqrt(a);
		for (int i = 1; i <= end; ++i) {
			if (a % i == 0 && i > b) {
				count++;
			}

			if (a / i > b && a % i == 0 && a / i != i) {
				count++;
			}
		}

		System.out.println(count);

	}
}
