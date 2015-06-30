import java.util.Scanner;

public class A78 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int count = countVowel(str);

		if (count != 5) {
			System.out.println("NO");
			return;
		}

		str = in.nextLine();
		count = countVowel(str);

		if (count != 7) {
			System.out.println("NO");
			return;
		}

		str = in.nextLine();
		count = countVowel(str);

		if (count != 5) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}

	}

	private static int countVowel(String str) {
		int length = str.length();
		int count = 0;
		for (int i = 0; i < length; ++i) {
			if (str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'a'
					|| str.charAt(i) == 'e') {
				count++;
			}
		}
		return count;
	}
}
