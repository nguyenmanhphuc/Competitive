import java.util.Scanner;

public class A133 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();

		if (input.lastIndexOf("H") >= 0 || input.lastIndexOf("Q") >= 0
				|| input.lastIndexOf("9") >= 0 ) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
