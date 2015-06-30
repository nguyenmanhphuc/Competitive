import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		while (!(s = in.next()).equals("END")) {
			if (s.equals("1")) {
				System.out.println(1);
				continue;
			}
			// int i = 0;
			int t = s.length();
			int p = t;
			t = (p + "").length();
			int step = 2;
			while (p != 1) {
				step++;
				t = (p + "").length();
				p = t;
			}
			System.out.println(step);
		}

	}
}
