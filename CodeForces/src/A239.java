import java.io.PrintWriter;
import java.util.Scanner;

public class A239 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();
		int k = in.nextInt();
		int n = in.nextInt();

		int cur = (y / k + 1) * k;
		PrintWriter writer = new PrintWriter(System.out);
		int count = n / k - y / k;
		if (count <= 0) {
			writer.println(-1);
			writer.close();
			return;
		}
		count = 0;
		while (cur <= n) {
			if (count > 0) {
				writer.print(' ');
			}
			writer.print(cur - y);
			count++;
			cur += k;
		}
		writer.println();
		writer.close();

	}

}
