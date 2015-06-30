import java.util.Scanner;

public class A280 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		int length = s.length;
		int pre = -1;
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < length; ++i) {
			if (s[i] == 'W' && (i + 1 < length && s[i + 1] == 'U')
					&& (i + 2 < length && s[i + 2] == 'B')) {
				if (pre != ' ') {
					str.append(' ');
					pre = ' ';
				}
				i += 2;
			} else {
				str.append(s[i]);
				pre = s[i];
			}
		}
		System.out.println(str.toString().trim());

	}

}
