import java.util.Scanner;

public class A34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
		}

		arr[n] = arr[0];
		int min = Integer.MAX_VALUE;
		int index = -1;
		for (int i = 0; i < n; ++i) {
			if (Math.abs(arr[i + 1] - arr[i]) < min) {
				min = Math.abs(arr[i + 1] - arr[i]);
				index = i;
			}
		}
		System.out
				.println((index + 1) + " " + (index + 1 == n ? 1 : index + 2));

	}

}
