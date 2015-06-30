import java.util.Scanner;

public class A416 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int l = -2000000000;
		int r = 2000000000;
		for (int i = 0; i < n; ++i) {
			String q = in.next();
			int v = in.nextInt();
			char a = in.next().charAt(0);
			if (q.equals("<=")) {
				if (a == 'N') {
					l = Math.max(l, v + 1);
				} else {
					r = Math.min(r, v);
				}

			} else if (q.equals(">=")) {
				if (a == 'Y') {
					l = Math.max(l, v);
				} else {
					r = Math.min(r, v - 1);
				}

			} else if (q.equals(">")) {
				if (a == 'Y') {
					l = Math.max(l, v + 1);
				} else {
					r = Math.min(r, v);
				}

			} else {
				if (a == 'N') {
					l = Math.max(l, v);
				} else {
					r = Math.min(r, v - 1);
				}

			}
			if (l > r) {
				System.out.println("Impossible");
				return;
			}

		}
		System.out.println(l);

	}
}
