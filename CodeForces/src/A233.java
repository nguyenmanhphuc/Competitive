import java.util.Scanner;

public class A233 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if ((n & 1) > 0) {
			System.out.println("-1");
			return;
		}

		for (int i = 1; i < n; i += 2) {
			if (i == 1) {
				System.out.print((i + 1) + " " + i);
			} else {
				System.out.print(" " + (i + 1) + " " + i);
			}
		}
		System.out.println();

	}

}
