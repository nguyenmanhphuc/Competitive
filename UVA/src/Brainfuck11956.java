import java.util.Scanner;

public class Brainfuck11956 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int cas = 1; cas <= t; ++cas) {
			StringBuilder result = new StringBuilder();
			result.append("Case ");
			result.append(cas);
			result.append(":");

			int[] bytes = new int[100];
			char[] s = in.next().toCharArray();
			int index = 0;
			int length = s.length;
			for (int j = 0; j < length; ++j) {
				if (s[j] == '<') {
					if (index == 0) {
						index = 99;
					} else {
						index--;
					}
				} else if (s[j] == '>') {
					if (index == 99) {
						index = 0;
					} else {
						index++;
					}
				} else if (s[j] == '+') {
					if (bytes[index] == 255) {
						bytes[index] = 0;
					} else {
						bytes[index]++;
					}
				} else if (s[j] == '-') {
					if (bytes[index] == 0) {
						bytes[index] = 255;
					} else {
						bytes[index]--;
					}
				}
			}
			for (int i = 0; i < 100; ++i) {
				result.append(" ");
				result.append(getHex(bytes[i] >> 4));
				result.append(getHex(bytes[i] & 15));
			}

			System.out.println(result);

		}

	}

	static char getHex(int r) {
		if (r == 10) {
			return 'A';
		} else if (r == 11) {
			return 'B';
		} else if (r == 12) {
			return 'C';
		} else if (r == 13) {
			return 'D';
		} else if (r == 14) {
			return 'E';
		} else if (r == 15) {
			return 'F';
		} else {
			return (char) (r - 0 + '0');
		}
	}
}
