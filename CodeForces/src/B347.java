import java.util.Scanner;

public class B347 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int[] pos = new int[n];
		int countFixedPoints = 0;
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
			pos[arr[i]] = i;
			if (arr[i] == i) {
				countFixedPoints++;
			}
		}

		for (int i = 0; i < n; ++i) {
			if (arr[i] != i) {
				if (arr[arr[i]] == i) {
					System.out.println(countFixedPoints + 2);
					return;
				}
			}
		}

		System.out.println(Math.min(countFixedPoints + 1, n));

	}

}
