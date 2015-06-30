import java.util.Scanner;

public class A297 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		char[] s = in.next().toCharArray();
		char[] n = in.next().toCharArray();
		for (int i = 0; i < s.length; ++i) {
			count += s[i] == '1' ? 1 : 0;
		}
		count += count % 2 == 1 ? 1 : 0;

		for (int i = 0; i < n.length; ++i) {
			count -= n[i] == '1' ? 1 : 0;
		}

		if (count >= 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
