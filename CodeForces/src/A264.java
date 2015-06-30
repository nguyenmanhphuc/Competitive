import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class A264 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char escapes[] = in.next().toCharArray();

		int length = escapes.length;
		int[] stones = new int[length];
		int left = 0;
		int right = length - 1;
		for (int i = 0; i < length; ++i) {
			if (escapes[i] == 'l') {
				stones[right--] = i + 1;
			} else {
				stones[left++] = i + 1;
			}
		}

		PrintWriter writer = new PrintWriter(System.out);
		for (int j : stones) {
			writer.println(j);
		}
		writer.close();

	}
}
