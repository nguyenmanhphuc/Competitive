import java.util.Scanner;

public class A296 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[1000 + 1];
		for (int i = 0; i < n; ++i) {
			arr[in.nextInt()]++;
		}

		for (int i = 1; i <= 1000; ++i) {
			if (arr[i] > (n + 1) / 2) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

	}

}
