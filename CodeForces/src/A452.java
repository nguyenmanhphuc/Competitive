import java.util.Scanner;

public class A452 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] s = in.next().toCharArray();
		String names[] = { "vaporeon", "jolteon", "flareon", "espeon",
				"umbreon", "leafeon", "glaceon", "sylveon" };
		for (String name : names) {
			if (name.length() != n) {
				continue;
			}
			boolean isAns = true;
			char[] name1 = name.toCharArray();
			for (int i = 0; i < n; ++i) {
				if (s[i] != '.' && name.charAt(i) != s[i]) {
					isAns = false;
					break;
				}
			}
			if (isAns) {
				System.out.println(name);
				return;
			}
		}
	}
}
