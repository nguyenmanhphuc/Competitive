import java.util.Scanner;

public class KindergartenCountingGame494 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String s = in.nextLine();
			int l = s.length();
			int count = 0;
			for (int i = 0; i < l; ++i) {
				if (checkLetter(s.charAt(i))) {
					if (i == 0) {
						count++;
					} else if (!checkLetter(s.charAt(i - 1))) {
						count++;
					}
				}
			}
			System.out.println(count);
		}

	}

	static boolean checkLetter(char c) {
		if (c >= 'a' && c <= 'z') {
			return true;
		}
		if (c >= 'A' && c <= 'Z') {
			return true;
		}
		return false;
	}

}
