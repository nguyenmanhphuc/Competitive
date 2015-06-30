import java.util.Scanner;

public class P151PROF {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] digits = in.next().toCharArray();
		int x = in.nextInt();
		int y = in.nextInt();
		int l = digits.length;
		long mod[] = new long[l + 1];
		long more = 1;
		mod[l - 1] = digits[l - 1] - '0';
		for (int i = l - 1; i > 0; --i) {

			mod[i] = (mod[i + 1] + (digits[i] - '0') * 10 * more) % y;
			more = (more * 10) % y;
		}

		long z = 0;
		l--;
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < l; ++i) {
			z = (z * 10 + digits[i] - '0') % x;
			if (z == 0 && mod[i + 1] == 0) {
				for (int j = 0; j <= i; ++j) {
					str.append(digits[j]);
				}
				int j = i + 1;
				while (j <= l && digits[j] == '0') {
					str.append(digits[j]);
					j++;
				}
				str.append('\n');
				if (j >l) {
					System.out.println("NO");
					return;
				}

				for (; j <= l; ++j) {
					str.append(digits[j]);
				}
				System.out.println("YES");
				System.out.println(str);
				return;
			}
		}

		System.out.println("NO");

	}

}
