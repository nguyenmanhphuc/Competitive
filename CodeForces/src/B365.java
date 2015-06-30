import java.util.Scanner;

public class B365 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n <= 2) {
			System.out.println(n);
			return;
		}

		int[] arr = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
		}

		int max = 2;
		int length = 2;
		for (int i = 2; i < n; ++i) {
			if (arr[i] == arr[i - 1] + arr[i - 2]) {
				length++;
			} else {
				max = Math.max(max, length);
				length = 2;
			}
		}
		System.out.println(Math.max(max, length));
	}

}
