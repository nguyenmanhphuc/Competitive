import java.util.Scanner;

public class A214 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int count = 0;
		for (int a = 0; a < 100; ++a) {
			int b = n - a * a;
			if (b >= 0 && a + b * b == m) {
				count++;
			}
		}
		System.out.println(count);

	}

}
