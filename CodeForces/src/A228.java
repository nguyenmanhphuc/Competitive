import java.util.Arrays;
import java.util.Scanner;

public class A228 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] colors = new int[4];
		for (int i = 0; i < 4; ++i) {
			colors[i] = in.nextInt();
		}

		Arrays.sort(colors);
		int count = 1;
		for (int i = 1; i < 4; ++i) {
			if (colors[i] != colors[i - 1]) {
				count++;
			}
		}
		System.out.println(4 - count);
	}

}
