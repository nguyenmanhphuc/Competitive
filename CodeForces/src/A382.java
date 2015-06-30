import java.util.Scanner;

public class A382 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String used = in.next();
		int index = used.indexOf('|');
		String left = used.substring(0, index);
		String right = used.substring(index + 1);
		String remain = in.next();
		int leftLength = left.length();
		int rightLength = right.length();
		int remainLength = remain.length();

		int diff = Math.abs(leftLength - rightLength);
		if (remainLength < diff || (remainLength - diff) % 2 == 1) {
			System.out.println("Impossible");
			return;
		}
		StringBuilder leftResult = new StringBuilder(left);
		StringBuilder rightResult = new StringBuilder(right);
		int delimiter = (remainLength - diff) / 2 + (leftLength < rightLength ? diff
				: 0);
		leftResult.append(remain.substring(0, delimiter)).append('|');
		rightResult.append(remain.substring(delimiter));
		System.out.print(leftResult);
		System.out.println(rightResult);
	}
}
