import java.util.Arrays;
import java.util.Scanner;

public class B160 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] number = in.next().toCharArray();
		char[] first = new char[n];
		char[] second = new char[n];
		for (int i = 0; i < (n << 1); ++i) {
			if (i < n) {
				first[i] = number[i];
			} else {
				second[i - n] = number[i];
			}
		}

		Arrays.sort(first);
		Arrays.sort(second);
		int cmp = first[0] - second[0];
		if (cmp == 0) {
			System.out.println("NO");
			return;
		}
		for (int i = 1; i < n; ++i) {
			int k = first[i] - second[i];
			if (k * cmp <= 0) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

}
