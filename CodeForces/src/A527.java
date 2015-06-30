import java.util.Scanner;

public class A527 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long count = 0;
		while (b > 0) {
			long r = a % b;
			count += (a - r) / b;
			a = b;
			b = r;
		}
		System.out.println(count);

	}

}
