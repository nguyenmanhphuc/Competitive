import java.util.Scanner;

public class A534 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		StringBuilder str = new StringBuilder();
		int mid = (n + 1) / 2 + 1;

		int left = 1;

		int r = mid;
		int pre = -1;

		if (n == 1) {
			System.out.println("1\n1");
			return;
		} else if (n == 2) {
			System.out.println("1\n1");
			return;
		} else if (n == 3) {
			System.out.println("2\n1 3");
			return;
		} else if (n == 4) {
			System.out.println("4\n2 4 1 3");
			return;
		}

		boolean has = false;
		while (r <= n) {
			if (has) {
				str.append(' ');
				
			}
			has = true;
			str.append(left++);

			str.append(' ');
			str.append(r++);
		}

		if (n % 2 == 1) {
			if (has) {
				str.append(' ');
				has = true;
			}
			str.append(left++);
		}
		System.out.println(n);
		System.out.println(str);
	}
}
