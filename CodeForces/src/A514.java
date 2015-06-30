import java.util.Scanner;

public class A514 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		int l = s.length;
		long r = 0;
		int c = s[0] - '0';
		r = c == 9 ? 9 : Math.min(c, 9 - c);
		for (int i = 1; i < l; ++i) {
			 c = s[i] - '0';
			r = r * 10 + Math.min(c, 9 - c);
		}
		System.out.println(r);

	}

}
