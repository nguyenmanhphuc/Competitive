import java.util.Scanner;

public class A510 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			if ((i & 1) == 0) {
				for (int j = 0; j < m; ++j) {
					str.append('#');
				}
				str.append('\n');
			} else if ((i + 1) % 4 == 0) {
				str.append('#');
				for (int j = 1; j < m; ++j) {
					str.append('.');
				}
				str.append('\n');
			} else {
				
				for (int j = 1; j < m; ++j) {
					str.append('.');
				}
				str.append('#');
				str.append('\n');
			}
		}
		System.out.print(str);

	}

}
