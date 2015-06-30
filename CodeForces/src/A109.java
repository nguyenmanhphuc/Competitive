import java.io.PrintWriter;
import java.util.Scanner;

public class A109 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < 7; ++i) {
			if ((n - i * 4) % 7 == 0 && n - (i << 2) >= 0) {
				for (int j = 0; j < i; ++j) {
					writer.print(4);
				}
				for (int j = (n - i * 4) / 7; j > 0; --j) {
					writer.print(7);
				}
				writer.println();
				writer.close();
				return;
			}
		}
		writer.println(-1);
		writer.close();

	}
}
