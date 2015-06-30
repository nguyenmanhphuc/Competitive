import java.io.PrintWriter;
import java.util.Scanner;

public class B544 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int numberOfCells = n * n;
		int maxIslands = (numberOfCells + 1) / 2;
		int k = in.nextInt();
		if (maxIslands < k) {
			System.out.println("NO");
			return;
		} else {
			System.out.println("YES");
		}

		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if ((i + j) % 2 == 0 && k > 0) {
					writer.print('L');
					k--;
				} else {
					writer.print('S');
				}
			}
			writer.println();
		}
		writer.close();
	}

}
