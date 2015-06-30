import java.util.Arrays;
import java.util.Scanner;

public class C486 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int p = in.nextInt();
		char[] s = in.next().toCharArray();
		if (n == 1) {
			System.out.println(0);
			return;
		}
		long result = 0;
		int move = 0;
		int c = 'z' - 'a' + 1;
		int sum = 0;
		n--;
		boolean change[] = new boolean[n + 1];
		for (int i = 0; i <= n; ++i) {
			int currentIndex = (p + i - 1) >= n ? (p + i - 1) - n : (p - 1 + i);

			if (s[currentIndex] == s[n - currentIndex]) {
				continue;
			}
			if (s[currentIndex] > s[n - currentIndex]) {
				sum += Math.min(s[currentIndex] - s[n - currentIndex], c
						- s[currentIndex] + s[n - currentIndex]);
			} else {
				sum += Math.min(-s[currentIndex] + s[n - currentIndex], c
						+ s[currentIndex] - s[n - currentIndex]);
			}
			s[currentIndex] = s[n - currentIndex];
			change[currentIndex] = true;
			change[n - currentIndex] = true;
		}

		boolean tempArr[] = Arrays.copyOf(change, n + 1);
		for (int i = 0; i <= n; ++i) {
			int index = (i - 1 + p) % (n + 1);
			if (tempArr[index]) {
				tempArr[index] = false;
				tempArr[n - index] = false;
				move = i;
			}
		}
		int tempMove = 0;
		tempArr = Arrays.copyOf(change, n + 1);

		for (int i = 0; i <= n; ++i) {
			int index = (p - 1 - i) < 0 ? p - i + n : p - 1 - i;
			if (tempArr[index]) {
				tempArr[index] = false;
				tempArr[n - index] = false;
				tempMove = i;
			}
		}
		if (n <= 1) {
			System.out.println(sum);
			return;
		}
		move = Math.min(move, tempMove);
		tempArr = Arrays.copyOf(change, n + 1);

		int left = p - 1;
		int right = p - 1;
		if (p >= (n + 1) / 2) {
			int t = p - 1;
			for (int i = p - 1; i >= (n + 1) / 2; --i) {
				if (change[i]) {
					t = i;
				}
			}
			int z = p - 1;
			for (int i = p - 1; i <= n; ++i) {
				if (change[i]) {
					z = i;
				}
			}
			tempMove = Math.min(p - 1 - t, z - p + 1) * 2
					+ Math.max(p - 1 - t, z - p + 1);
		} else {
			int t = p - 1;
			for (int i = p - 1; i >= 0; --i) {
				if (change[i]) {
					t = i;
				}
			}
			int z = p - 1;
			for (int i = p - 1; i < (n + 1) / 2; ++i) {
				if (change[i]) {
					z = i;
				}
			}
			tempMove = Math.min(tempMove, Math.min(p - 1 - t, z - p + 1) * 2
					+ Math.max(p - 1 - t, z - p + 1));
		}
		sum += Math.min(move, tempMove);
		System.out.println(sum);
	}
}
