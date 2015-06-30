import java.util.Scanner;

public class B276 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] count = new int['z' + 1];
		char[] str = in.next().toCharArray();
		for (char c : str) {
			count[c]++;
		}

		int countOdd = 0;
		for (char c = 'a'; c <= 'z'; ++c) {
			if (count[c] % 2 == 1) {
				countOdd++;
			}
		}
		if ((countOdd) % 2 == 1 || countOdd == 0) {
			System.out.println("First");
		} else {
			System.out.println("Second");
		}
	}
}
