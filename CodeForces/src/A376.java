import java.util.Scanner;

public class A376 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String bar = in.next();
		int pivotIndex = bar.indexOf('^');
		long left = 0;
		long right = 0;
		for (int i = pivotIndex - 1; i >= 0; --i) {
			char c = bar.charAt(i);
			if (c == '=') {
				continue;
			}

			left += (pivotIndex - i) * (c - '0');
		}

		for (int i = pivotIndex + 1; i < bar.length(); ++i) {
			char c = bar.charAt(i);
			if (c == '=') {
				continue;
			}

			right += (-pivotIndex + i) * (c - '0');
		}

		if (left == right) {
			System.out.println("balance");
		} else if (left < right) {
			System.out.println("right");
		} else {
			System.out.println("left");
		}
	}

}
