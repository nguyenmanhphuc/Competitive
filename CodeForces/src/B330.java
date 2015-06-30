import java.io.PrintWriter;
import java.util.Scanner;

public class B330 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean exist[] = new boolean[n + 1];
		int m = in.nextInt();
		for (int i = 0; i < m; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			exist[a] = true;
			exist[b] = true;
		}

		int root = -1;
		for (int i = 1; i <= n; ++i) {
			if (!exist[i]) {
				root = i;
				break;
			}
		}

		PrintWriter writer = new PrintWriter(System.out);
		writer.println(n - 1);
		for (int i = 1; i <= n; ++i) {
			if (i == root) {
				continue;
			}

			writer.println(root + " " + i);
		}

		writer.close();
	}

}
