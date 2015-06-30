import java.util.Scanner;

public class A118 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		input = input.toLowerCase();

		StringBuilder str = new StringBuilder();
		int length = input.length();
		for (int i = 0; i < length; ++i) {
			if (!isVowel(input.charAt(i))) {
				str.append('.');
				str.append(input.charAt(i));
			}
		}
		System.out.println(str);

	}

	static Boolean isVowel(char c) {
		return c == 'a' || c == 'o' || c == 'y' || c == 'e' || c == 'u'
				|| c == 'i';
	}

}
