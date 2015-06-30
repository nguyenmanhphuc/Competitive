import java.util.Scanner;

public class A245 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[][] = new int[3][2];
		for (int i = 0; i < n; ++i) {
			int t = in.nextInt();
			arr[t][0] += in.nextInt();
			arr[t][1] += in.nextInt();
		}

		for (int i = 1; i <= 2; ++i) {
			int sum = arr[i][0] + arr[i][1];
			if (arr[i][0] * 2 >= sum) {
				System.out.println("LIVE");
			} else {
				System.out.println("DEAD");
			}
		}
	}
}
