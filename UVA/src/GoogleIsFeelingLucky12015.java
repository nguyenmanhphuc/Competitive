import java.util.Scanner;

public class GoogleIsFeelingLucky12015 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		StringBuilder str = new StringBuilder();
		for (int i = 1; i <= n; ++i) {
			str.append("Case #");
			str.append(i);
			str.append(":\n");
			StringBuilder current = new StringBuilder();
			int max = -1;
			for (int j = 0; j < 10; ++j) {
				String temp = in.next();
				int r = in.nextInt();
				if (r > max) {
					current = new StringBuilder();
					current.append(temp);
					current.append("\n");
					max = r;
				} else if (r == max) {
					current.append(temp);
					current.append("\n");
				}
			}
			str.append(current);
		}
		System.out.print(str);

	}
}
