import java.util.Scanner;

public class A131 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] word = in.next().toCharArray();

		int length = word.length;
		int count = 0;
		for (int i = 0; i < length; ++i) {
			if (isUpperCase(word[i])) {
				count++;
			}
		}

		if (count == length) {
			for (int i = 0; i < length; ++i) {
				word[i] = changeCase(word[i]);
			}
			System.out.println(new String(word));
		} else if (!isUpperCase(word[0]) && count >= length - 1) {
			for (int i = 0; i < length; ++i) {
				word[i] = changeCase(word[i]);
			}
			System.out.println(new String(word));
		} else {
			System.out.println(new String(word));
		}

	}

	static boolean isUpperCase(char c) {
		return c <= 'Z' && c >= 'A';
	}

	static char toLowerCase(char c) {
		if (isUpperCase(c)) {
			return (char) (c + 'a' - 'A');
		}
		return c;
	}

	static char toUpperCase(char c) {
		if (!isUpperCase(c)) {
			return (char) (c - 'a' + 'A');
		}
		return c;
	}

	static char changeCase(char c) {
		if (isUpperCase(c)) {
			return toLowerCase(c);
		}
		return toUpperCase(c);
	}

}
