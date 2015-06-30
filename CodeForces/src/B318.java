import java.util.Scanner;

public class B318 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] str = in.next().toCharArray();
		int length = str.length;
		int[] count = new int[length];
		char[] metal = "metal".toCharArray();
		for (int i = length - 5; i >= 0; --i) {
			if (str[i] != 'm') {
				count[i] = count[i + 1];
				continue;
			}

			boolean isMetalWord = true;
			for (int j = 1; j < 5; ++j) {
				if (str[i + j] != metal[j]) {
					isMetalWord = false;
					break;
				}
			}
			count[i] = count[i + 1] + (isMetalWord ? 1 : 0);
		}

		char[] heavyWord = "heavy".toCharArray();
		long result = 0;
		int limit = length - 5;
		for (int i = 0; i < limit; ++i) {
			if (str[i] != 'h') {
				continue;
			}

			boolean isHeavyWord = true;
			for (int j = 1; j < 5; ++j) {
				if (str[i + j] != heavyWord[j]) {
					isHeavyWord = false;
					break;
				}
			}
			result += isHeavyWord ? count[i] : 0;
		}
		System.out.println(result);

	}
}
