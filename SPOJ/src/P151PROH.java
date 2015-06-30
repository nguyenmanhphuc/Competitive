import java.util.Scanner;

class P151PROH {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] n = in.next().toCharArray();
		int length = n.length;
		if (n[0] != '1') {
			System.out.println("NO");
			return;
		}

		int countFour = 0;
		for (int i = 1; i < length; ++i) {
			if (n[i] == '1') {
				if (countFour > 2) {
					System.out.println("NO");
					return;
				}
				countFour = 0;
			} else if (n[i] == '4') {
				countFour++;
			} else {
				System.out.println("NO");
				return;
			}
		}
		if (countFour > 2) {
			System.out.println("NO");
			return;
		}
		System.out.println("YES");

	}

}
