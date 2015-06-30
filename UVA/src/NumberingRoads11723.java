import java.util.Scanner;

public class NumberingRoads11723 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int n = in.nextInt();
		int cas = 1;
		StringBuilder str = new StringBuilder();
		while (r + n > 0) {
			str.append("Case ");
			str.append(cas);
			str.append(": ");
			int result = 0;
			if (r > 27 * n) {
				str.append("impossible\n");
			} else {
				if (r > n) {
					result = (r - 1) / n;
				}
				str.append(result);
				str.append("\n");
			}
			r = in.nextInt();
			n = in.nextInt();
			cas++;
		}
		System.out.print(str);

	}

}
