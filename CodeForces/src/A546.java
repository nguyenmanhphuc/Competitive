import java.util.Scanner;

public class A546 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		long n = in.nextInt();

		int w = in.nextInt();
		long total = (1 + w) * w / 2;
		System.out.println(Math.max(total * k - n, 0));
	}
}
