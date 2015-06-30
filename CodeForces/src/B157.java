import java.util.Arrays;
import java.util.Scanner;

public class B157 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double result = 0;
		boolean isRed = n % 2 == 1;
		int[] radius = new int[n];
		for (int i = 0; i < n; ++i) {
			radius[i] = in.nextInt();
		}

		Arrays.sort(radius);
		double insideArea = 0;
		for (int i = 0; i < n; ++i) {
			double outsideArea = Math.PI * radius[i] * radius[i];
			if (isRed) {
				result += outsideArea - insideArea;

			}
			isRed = !isRed;
			insideArea = outsideArea;
		}
		System.out.println(result);
	}
}
