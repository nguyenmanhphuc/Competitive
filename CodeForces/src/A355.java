import java.io.PrintWriter;
import java.util.Scanner;

public class A355 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		if (k == 0 && n > 1) {
			System.out.println("No solution");
			return;
		}
		PrintWriter writer = new PrintWriter(System.out);
		writer.print(k);
		for (int i = 1; i < n; ++i) {
			writer.print(0);
		}
		writer.println();
		writer.close();

	}

}
