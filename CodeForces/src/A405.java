import java.util.Arrays;
import java.util.Scanner;

public class A405 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr);

		System.out.print(arr[0]);
		for (int i = 1; i < n; ++i) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		return;
	}

}
