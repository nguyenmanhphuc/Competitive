import java.util.Scanner;

public class A71 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; ++i) {
			String s = in.next();
			int length = s.length();
			if (length > 10) {
				System.out.println((s.charAt(0)) + "" + (length - 2)
						+ s.charAt(length - 1));
			} else {
				System.out.println(s);
			}
		}

	}

}
