import java.util.Scanner;

public class A486 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long result = (n / 2);
		if (n % 2 != 0) {
			result -= n;
		}

		System.out.println(result);
	}

}
