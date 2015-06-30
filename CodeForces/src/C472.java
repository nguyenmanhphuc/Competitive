import java.util.Scanner;

public class C472 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n == 1) {
			System.out.println("YES");
			return;
		}
		String[] firstNames = new String[n];
		String[] lastNames = new String[n];
		for (int i = 0; i < n; ++i) {
			firstNames[i] = in.next();
			lastNames[i] = in.next();
		}

		int[] p = new int[n];
		for (int i = 0; i < n; ++i) {
			p[i] = in.nextInt() - 1;
		}
		String cur = firstNames[p[0]].compareTo(lastNames[p[0]]) < 0 ? firstNames[p[0]]
				: lastNames[p[0]];
		for (int i = 1; i < n; ++i) {
			String max = "";
			String min = "";
			if (firstNames[p[i]].compareTo(lastNames[p[i]]) < 0) {
				max = lastNames[p[i]];
				min = firstNames[p[i]];
			} else {
				min = lastNames[p[i]];
				max = firstNames[p[i]];
			}

			if (cur.compareTo(min) < 0) {
				cur = min;
			} else if (cur.compareTo(max) < 0) {
				cur = max;
			} else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		return;
	}

}
