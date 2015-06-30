import java.util.Arrays;
import java.util.Scanner;

 class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 1; i <= t; ++i) {
			int arr[] = new int[3];
			arr[0] = in.nextInt();
			arr[1] = in.nextInt();
			arr[2] = in.nextInt();

			Arrays.sort(arr);
			System.out.println("Case " + i + ": " + arr[1]);
		}

	}

}
