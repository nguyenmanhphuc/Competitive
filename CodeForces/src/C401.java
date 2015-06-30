import java.io.PrintWriter;
import java.util.Scanner;

public class C401 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		if (n > m + 1 || m - 2 > 2 * n) {
			System.out.println(-1);
			return;
		}
		PrintWriter writer = new PrintWriter(System.out);
		if (n > m) {
			for (int i = 0; i < n + m; ++i) {
				if ((i & 1) == 0) {
					writer.print(0);
				} else {
					writer.print(1);
				}
			}
			writer.println();
			writer.close();
			return;
		}

		while (m > 0 || n > 0) {
			writer.print(1);
			m--;
			if (m >= n&&m>0) {
				writer.print(1);
				m--;
			}
			
			if(n>0){
				writer.print(0);
				n--;
			}
		}
		writer.println();
		writer.close();

	}
}
