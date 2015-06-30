import java.util.Scanner;

public class A20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		int length = s.length;
		StringBuilder str = new StringBuilder();
		str.append(s[0]);
		for (int i = 1; i < length; ++i) {
			if (s[i] != s[i - 1]||s[i]!='/') {
				str.append(s[i]);
			}
		}

		String r = str.toString();
		if (r.charAt(r.length() - 1) == '/'&&r.length()>1) {
			System.out.println(r.substring(0, r.length() - 1));
		}else{
			System.out.println(r);
		}

	}

}
