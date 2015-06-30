import java.util.Scanner;

public class B385 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		int count = 0;
		int length = s.length;
		int pre = -1;
		for (int i = 0; i < length - 3; ++i) {
			if (s[i] == 'b' && s[i + 1] == 'e' && s[i + 2] == 'a'
					&& s[i + 3] == 'r') {
				count += (length - (i + 3)) * (i - pre);
				pre = i;
			}
		}
		System.out.println(count);

	}
}
