import java.util.Arrays;
import java.util.Scanner;

public class A347 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);

		System.out.print(arr[n - 1]);
		for (int i = 1; i < n - 1; ++i) {
			System.out.print(" " + arr[i]);
		}
		System.out.println(" " + arr[0]);
	}

}
