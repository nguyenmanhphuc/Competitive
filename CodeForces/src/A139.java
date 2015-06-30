import java.util.Scanner;

public class A139 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int page[] = new int[7];
		int sum = 0;
		int last = -1;
		for (int i = 0; i < 7; ++i) {
			page[i] = in.nextInt();
			sum += page[i];
			if (page[i] > 0) {
				last = i;
			}
		}

		n %= sum;
		if (n == 0) {
			System.out.println(last + 1);
			return;
		}

		for (int i = 0; i < 7; ++i) {
			n -= page[i];
			if (n <= 0) {
				System.out.println(i + 1);
				return;
			}
		}
	}
}
