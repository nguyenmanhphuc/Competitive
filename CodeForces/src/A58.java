import java.util.Scanner;

public class A58 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = { 'h', 'e', 'l', 'l', 'o' };

		/*
		 * char[] mess = in.next().toCharArray(); int length = mess.length; int
		 * j = -1; for (int i = 0; i < 5; ++i) { for (j = j + 1; j < length;
		 * ++j) { if (mess[j] == s[i]) { break; } }
		 * 
		 * if (j >= length) { System.out.println("NO"); return; } }
		 */
		String message = in.next();
		System.out.println(message
				.matches("^[a-z]*h[a-z]*e[a-z]*l[a-z]*l[a-z]*o[a-z]*$") ? "YES"
				: "NO");

		// System.out.println("YES");
	}
}
