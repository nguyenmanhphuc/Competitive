import java.util.Scanner;

public class A474 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] z = "qwertyuiopasdfghjkl;zxcvbnm,./".toCharArray();
		char type = in.next().charAt(0);
		StringBuilder result = new StringBuilder();

		int length = z.length;
		char[] input = in.next().toCharArray();
		for (char c : input) {
			for (int i = 0; i < length; ++i) {
				if (z[i] == c) {
					if (type == 'L') {
						result.append(z[i + 1]);
					} else {
						result.append(z[i - 1]);
					}
				}
			}
		}
		System.out.println(result);
	}

}
