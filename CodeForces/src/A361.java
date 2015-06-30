import java.io.PrintWriter;
import java.util.Scanner;

public class A361 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		PrintWriter writer = new PrintWriter(System.out);

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (j > 0) {
					writer.print(' ');
				}
				writer.print(i == j ? k : 0);

			}
			writer.println();
		}
		writer.close();

	}
}
