import java.util.Scanner;

public class SecretResearch621 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; ++i) {
			String str = in.next();
			if (str.equals("1") || str.equals("4") || str.equals("78")) {
				System.out.println("+");
			} else if (str.length() >= 2 && str.charAt(str.length() - 2) == '3'
					&& str.charAt(str.length() - 1) == '5') {
				System.out.println("-");
			} else if (str.length() >= 2 && str.charAt(0) == '9'
					&& str.charAt(str.length() - 1) == '4') {
				System.out.println("*");
			} else {
				System.out.println("?");
			}
		}
	}
}
