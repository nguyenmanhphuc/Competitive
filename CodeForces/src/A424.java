import java.util.Scanner;

public class A424 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] hamsters = in.next().toCharArray();
		int count = 0;
		for (char c : hamsters) {
			if (c == 'x') {
				count++;
			}
		}

		int diff = count - (n - count);
		System.out.println(Math.abs(diff / 2));
		for (int i = 0; i < n; ++i) {
			if (diff < 0 && hamsters[i] == 'X') {
				hamsters[i] = 'x';
				diff += 2;
			} else if (diff > 0 && hamsters[i] == 'x') {
				diff -= 2;
				hamsters[i] = 'X';
			}
			if (diff == 0) {
				break;
			}
		}
		System.out.println(new String(hamsters));

	}

}
