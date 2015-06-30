import java.util.Scanner;

public class A373 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] count = new int[10];
		for (int i = 0; i < 4; ++i) {
			char[] row = in.next().toCharArray();
			for (char c : row) {
				if (c != '.') {
					count[c - '0']++;
				}
			}
		}
		n = n << 1;
		for (int i = 1; i <= 9; ++i) {
			if (count[i] > n) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

	}
}
