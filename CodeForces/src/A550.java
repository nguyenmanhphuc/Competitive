import java.util.Scanner;

public class A550 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] str = in.next().toCharArray();

		int length = str.length;
		boolean firstAB = true;
		boolean firstBA = true;
		for (int i = 0; i < length - 1; ++i) {
			if (str[i] == 'A' && str[i + 1] == 'B' && firstAB) {
				for (int j = i + 2; j < length - 1; ++j) {
					if (str[j] == 'B' && str[j + 1] == 'A') {
						System.out.println("YES");
						return;
					}
				}

				firstAB = !firstAB;

			} else if (str[i] == 'B' && str[i + 1] == 'A' && firstBA) {
				for (int j = i + 2; j < length - 1; ++j) {
					if (str[j] == 'A' && str[j + 1] == 'B') {
						System.out.println("YES");
						return;
					}
				}

				firstBA = !firstBA;
			}
		}

		System.out.println("NO");
		return;

	}
}
