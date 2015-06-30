import java.util.Scanner;

public class A538 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.next();
		String cf = "CODEFORCES";
		if (text.length() < 10) {
			System.out.println("NO");
			return;
		}
		int index = text.indexOf(cf);
		if (index == 0 || (index > 0 && index == text.length() - 10)) {
			System.out.println("YES");
			return;
		}
		int i = 0;
		while (i < 10 && text.charAt(i) == cf.charAt(i)) {
			i++;
		}
		int left = 10 - i;
		for (int j = text.length() - left; j < text.length(); ++j, ++i) {
			if (text.charAt(j) != cf.charAt(i)) {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");
	}
}
