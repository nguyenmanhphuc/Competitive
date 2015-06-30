import java.util.Scanner;

public class A3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String start = in.next();
		String end = in.next();

		int horizontal = Math.abs(start.charAt(0) - end.charAt(0));
		int vertical = Math.abs(start.charAt(1) - end.charAt(1));
		System.out.println(Math.max(horizontal, vertical));
		int min = Math.min(horizontal, vertical);

		char verChar = 'D';
		char horChar = 'L';
		if (start.charAt(1)< end.charAt(1)) {
			verChar = 'U';
		}
		if (start.charAt(0) < end.charAt(0)) {
			horChar = 'R';
		}

		for (int i = 0; i < min; ++i) {
			System.out.println(horChar + "" + verChar);
		}

		int max = Math.max(horizontal, vertical);
		char next = horizontal < vertical ? verChar : horChar;
		for (int i = min; i < max; ++i) {
			System.out.println(next);
		}
	}
}
