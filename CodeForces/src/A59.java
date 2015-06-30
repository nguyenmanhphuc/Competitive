import java.util.Scanner;

public class A59 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] cs = s.toCharArray();
		int length = cs.length;
		int lowerCase = 0;
		int upperCase = 0;

		for (int i = 0; i < length; ++i) {
			if (cs[i] <= 'Z') {
				upperCase++;
			} else {
				lowerCase++;
			}
		}
		System.out.println(upperCase > lowerCase ? s.toUpperCase() : s
				.toLowerCase());
	}

}
