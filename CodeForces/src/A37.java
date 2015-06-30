import java.util.Arrays;
import java.util.Scanner;

public class A37 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		int[] bars = new int[n];
		for (int i = 0; i < n; ++i) {
			bars[i] = in.nextInt();
		}
		Arrays.sort(bars);
		int cur = 0;
		int max = 0;
		
		int maxHeight = 0;
		int countDiff = 0;
		for (int i = 0; i < n; ++i) {
			if (bars[i] != cur) {
				maxHeight = Math.max(maxHeight, count);
				count = 1;
				cur = bars[i];
				countDiff++;

			} else {
				count++;
			}
		}
		maxHeight = Math.max(maxHeight, count);
		System.out.println(maxHeight + " " + countDiff);

	}

}
