import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[4];
		for (int i = 0; i < 4; ++i) {
			arr[i] = in.nextInt();
		}
		boolean possible = false;
		for (int i = 0; i < 4; ++i) {
			for (int j = i + 1; j < 4; ++j) {
				for (int k = j + 1; k < 4; ++k) {
					int a = arr[i];
					int b = arr[j];
					int c = arr[k];

					if (a + b > c && a + c > b && b + c > a) {
						System.out.println("TRIANGLE");
						return;
					} else if (a + b == c || c + a == b || b + c == a) {
						possible = true;
					}
				}
			}
		}
		
		System.out.println(possible?"SEGMENT":"IMPOSSIBLE");

	}
}
