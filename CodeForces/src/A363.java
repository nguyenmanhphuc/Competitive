import java.util.Scanner;

public class A363 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String digits[] = { "O-|-OOOO", "O-|O-OOO", "O-|OO-OO", "O-|OOO-O",
				"O-|OOOO-", "-O|-OOOO", "-O|O-OOO", "-O|OO-OO", "-O|OOO-O",
				"-O|OOOO-" };
		if (n == 0) {
			System.out.println(digits[0]);
			return;
		}
		while (n > 0) {
			System.out.println(digits[n % 10]);
			n /= 10;
		}

	}

}
