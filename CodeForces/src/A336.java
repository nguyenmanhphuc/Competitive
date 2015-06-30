import java.util.Scanner;

public class A336 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		long y = in.nextLong();
		if (x * y > 0) {
			long sum = x + y;
			if (x > 0) {
				System.out.println("0 " + sum + " " + sum + " 0");
			} else {
				System.out.println(sum + " 0 0 " + sum);
			}
		} else {
			long sum = x - y;
			if (x > 0) {
				System.out.println("0 " + (-sum) + " " + (sum) + " 0");
			} else {
				System.out.println(sum + " 0 0 " + (-sum) + " ");
			}
		}

	}
}
