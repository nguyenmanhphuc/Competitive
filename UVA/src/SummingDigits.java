import java.util.Scanner;

public class SummingDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		StringBuilder str = new StringBuilder();
		while ((n = in.nextInt()) != 0) {
			int result = 0;
			if (n < 10) {
				result = n;
			} else {
				result = n % 9;
				if (result == 0) {
					result = 9;
				}
			}
			str.append(result);
			str.append("\n");
		}
		System.out.print(str);
	}

}
