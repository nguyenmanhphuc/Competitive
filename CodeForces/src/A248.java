import java.util.Scanner;

public class A248 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int right[] = new int[2];
		int left[] = new int[2];
		for (int i = 0; i < n; ++i) {

			right[in.nextInt()]++;
			left[in.nextInt()]++;
		}
		int result = Math.min(right[0], right[1]) + Math.min(left[0], left[1]);
		System.out.println(result);

	}
}
