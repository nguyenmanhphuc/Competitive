import java.util.Scanner;

public class A38 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 1; i < n; ++i) {
			arr[i] = arr[i - 1] + in.nextInt();
		}

		int a = in.nextInt();
		int b = in.nextInt();

		System.out.println(arr[b - 1] - arr[a - 1]);

	}

}
