import java.util.Scanner;

public class C519 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		if (n > m * 2) {
			System.out.println(m);
		} else if (2 * n < m) {
			System.out.println(n);
		} else {
			System.out.println((n + m) / 3);
		}

	}

}
