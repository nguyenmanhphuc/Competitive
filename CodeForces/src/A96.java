import java.util.Scanner;

public class A96 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		char cur = s[0];
		int count = 0;
		int length = s.length;
		int start = 0;
		for (int i = 0; i < length; ++i) {
			if (s[i] == cur) {
				count++;
			} else if (count >= 7) {
				System.out.println("YES");
				return;
			} else {
				count = 1;
				cur = s[i];
				start = i;
			}
		}
		System.out.println(count >= 7 ?"YES":"NO");
	}

}
