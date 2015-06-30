import java.util.Scanner;

public class B363 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] heights = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			heights[i] = heights[i - 1] + in.nextInt();
		}

		int min = heights[k];
		int index = 1;
		for (int i = k + 1; i <= n; ++i) {
			if (heights[i] - heights[i - k] < min) {
				min = heights[i] - heights[i - k];
				index = i - k + 1;
			}
		}
		System.out.println(index);
	}

}
