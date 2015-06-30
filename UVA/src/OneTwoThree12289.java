import java.util.Scanner;

public class OneTwoThree12289 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		while (t-- > 0) {
			String s;
			s = in.next();
			if (s.length() == 5) {
				System.out.println(3);
				continue;
			}
			if ((s.charAt(0) == 'o' && s.charAt(2) == 'e')
					|| (s.charAt(0) == 'o' && s.charAt(1) == 'n')
					|| (s.charAt(1) == 'n' && s.charAt(2) == 'e')) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}
		}

	}
}
