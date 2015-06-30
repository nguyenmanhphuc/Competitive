import java.util.Arrays;
import java.util.Scanner;

public class A337 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Integer[] puzzles = new Integer[m];
		for (int i = 0; i < m; ++i) {
			puzzles[i] = in.nextInt();
		}

		Arrays.sort(puzzles);
		int minDiff = Integer.MAX_VALUE;
		for (int i = n - 1; i < m; ++i) {
			minDiff = Math.min(minDiff, puzzles[i] - puzzles[i - n + 1]);
		}
		System.out.println(minDiff);
	}

}
