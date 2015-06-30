import java.util.Scanner;

public class A320 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] n = in.next().toCharArray();
		int l = n.length;
		for (int i = 0; i < l; ++i) {
			if (n[i] != '1') {
				System.out.println("NO");
				return;
			}

			i = i + 1;
			int count = 0;
			while (i < l && n[i] == '4') {
				i++;
				count++;
			}

			if (count > 2) {
				System.out.println("NO");
				return;
			}

			if (i < l && n[i] != '1') {
				System.out.println("NO");
				return;
			}
			i--;
		}
		
		System.out.println("YES");

	}

}
