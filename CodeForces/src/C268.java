import java.io.PrintWriter;
import java.util.Scanner;

public class C268 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		PrintWriter writer = new PrintWriter(System.out);

		System.out.println(Math.min(n, m) + 1);
		int min = Math.min(n, m);
		for (int i = 0; i <= min; ++i) {
			writer.println(i + " " + (min - i));
		}
		writer.close();
	}
}
