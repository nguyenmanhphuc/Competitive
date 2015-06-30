import java.util.Scanner;

public class A305 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		StringBuilder str = new StringBuilder();
		int count = 0;
		boolean has2 = false;
		boolean has3 = false;
		int l = -1;
		for (int i = 0; i < n; ++i) {
			int t = in.nextInt();
			if (t == 0 || t == 100) {
				if (count > 0) {
					str.append(' ');
				}
				count++;
				str.append(t);
			} else if (t < 10) {
				if (has2) {
					continue;
				}
				has2 = true;

				if (count > 0) {
					str.append(' ');
				}

				count++;
				str.append(t);
			} else if (t % 10 == 0) {
				if (has3) {
					continue;
				}
				has3 = true;

				if (count > 0) {
					str.append(' ');
				}

				count++;
				str.append(t);
			} else {
				l = t;
			}
		}

		if (!(has2 || has3) && l > 0) {
			if (count > 0) {
				str.append(' ');
			}

			count++;
			str.append(l	);
		}
		
		
		System.out.println(count);
		System.out.println(str);

	}
}
