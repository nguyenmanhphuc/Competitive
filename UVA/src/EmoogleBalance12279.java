import java.util.Scanner;

public class EmoogleBalance12279 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cas = 1;
		int n;
		StringBuilder str = new StringBuilder();
		while ((n = in.nextInt()) != 0) {
			int count = 0;
			str.append("Case ");
			str.append(cas++);
			str.append(": ");
			for (int i = 0; i < n; ++i) {
				if (in.nextInt() == 0) {
					count++;
				}
			}
			str.append(n - (count << 1));
			str.append("\n");
		}
		System.out.print(str);

	}

}
