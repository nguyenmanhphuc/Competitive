import java.util.Scanner;

public class A104 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n <= 10 || n > 21) {
			System.out.println(0);
			return;
		}

		n -= 10;
		if (n != 10) {
			System.out.println(4);
		} else {
			System.out.println(15);
		}
	}
}
