import java.util.Scanner;

public class B405 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] str = in.next().toCharArray();
		int leftIndex = -1;
		int rightIndex = -1;
		int count = 0;

		for (int i = 0; i < n; ++i) {
			if (str[i] == 'L') {
				leftIndex = i;
			} else if (str[i] == 'R') {
				rightIndex = i;
				count += rightIndex - 1 - leftIndex;
				continue;

			} else {
				continue;
			}

			if (leftIndex != -1 && rightIndex != -1
					&& Math.abs(leftIndex - rightIndex) % 2 == 0) {
				count++;
			}
		}
		if (leftIndex == rightIndex && leftIndex == -1) {
			System.out.println(n);
			return;
		}

		if (leftIndex > rightIndex) {
			count += n - 1 - leftIndex;
		}
		System.out.println(count);

	}
}
