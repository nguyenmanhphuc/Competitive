import java.util.Scanner;

public class A144 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ar[] = new int[n];
		int lastMin = 0;
		int firstMax = 0;
		int min = in.nextInt();
		int max = min;
		for (int i = 1; i < n; ++i) {
			int t = in.nextInt();
			if (t > max) {
				max = t;
				firstMax = i;
			}
			if (t <= min) {
				min = t;
				lastMin = i;
			}
		}

		int result = (firstMax) + (n - 1 - lastMin);
		if (firstMax > lastMin) {
			result--;
		}
		System.out.println(result);
	}

}
