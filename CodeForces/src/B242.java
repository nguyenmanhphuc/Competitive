import java.util.Scanner;

public class B242 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int leftMost = Integer.MAX_VALUE;
		int rightMost = Integer.MIN_VALUE;
		int n = in.nextInt();
		int[] left = new int[n];
		int[] right = new int[n];
		for (int i = 0; i < n; ++i) {
			left[i] = in.nextInt();
			right[i] = in.nextInt();
			leftMost = Math.min(leftMost, left[i]);
			rightMost = Math.max(rightMost, right[i]);
		}
		for (int i = 0; i < n; i++) {
			if (left[i] == leftMost && right[i] == rightMost) {
				System.out.println(i + 1);
				return;
			}
		}
		System.out.println(-1);

	}

}
