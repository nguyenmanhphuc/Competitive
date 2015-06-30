import java.util.Scanner;

public class HappyBirthdaySong12554 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		StringBuilder str = new StringBuilder();
		String[] words = { "Happy", "birthday", "to", "you", "Happy",
				"birthday", "to", "you", "Happy", "birthday", "to", "Rujia",
				"Happy", "birthday", "to", "you" };

		int index = 0;
		String[] names = new String[n];
		for (int i = 0; i < n; ++i) {
			names[i] = in.next();
		}
		if (n >= 16) {
			for (int i = 0; i < n; ++i) {
				System.out.println(names[i] + ": " + words[index++]);
				if (index == 16) {
					index = 0;
				}
			}
			if (index == 0) {
				return;
			}
			for (int i = 0; index < 16; index++, i++) {
				System.out.println(names[i] + ": " + words[index]);
			}
		} else {
			for (int i = 0; i < 16; ++i) {
				System.out.println(names[index++] + ": " + words[i]);
				if (index == n) {
					index = 0;
				}
			}
		}
		in.close();
	}
}
