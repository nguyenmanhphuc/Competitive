import java.util.Scanner;

public class B508 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		int end = s.length - 1;
		char last = s[end];

		int current = -1;
		for (int i = 0; i < end; ++i) {
			if (((s[i] - '0') & 1) == 0) {

				current = i;
				if (s[current] < s[end]) {
					break;
				}
			}
		}
		if (current == -1) {
			System.out.println(-1);
		} else {
			char temp = s[end];
			s[end] = s[current];
			s[current] = temp;
			System.out.println(new String(s));
		}
	}
}
