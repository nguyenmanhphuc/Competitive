import java.io.PrintWriter;
import java.util.Scanner;

public class A342 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count[] = new int[8];
		for (int i = 0; i < n; ++i) {
			count[in.nextInt()]++;
		}
		PrintWriter writer = new PrintWriter(System.out);
		int min = Math.min(count[1], count[2]);
		min = Math.min(min, count[4]);
		for (int i = 0; i < min; ++i) {
			writer.println("1 2 4");
		}
		count[1] -= min;
		count[2] -= min;
		count[4] -= min;
		min = Math.min(count[1], count[2]);
		min = Math.min(min, count[6]);
		for (int i = 0; i < min; ++i) {
			writer.println("1 2 6");
		}
		count[1] -= min;
		count[2] -= min;
		count[6] -= min;

		min = Math.min(count[1], count[3]);
		min = Math.min(min, count[6]);
		for (int i = 0; i < min; ++i) {
			writer.println("1 3 6");
		}

		count[1] -= min;
		count[3] -= min;
		count[6] -= min;

		
		for (int i = 1; i <= 7; ++i) {
			if (count[i] != 0) {
				System.out.println(-1);
				return;
			}
		}

		writer.close();
	}

}
