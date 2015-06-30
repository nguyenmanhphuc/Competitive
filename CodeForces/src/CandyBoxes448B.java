import java.util.Arrays;
import java.util.Scanner;

public class CandyBoxes448B {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int n = in.nextInt();
		if (n == 0) {
			System.out.println("YES\n1\n1\n3\n3");
			return;
		}
		if (n == 1) {
			int x1 = in.nextInt();
			int x4 = x1 * 3;
			int s = x1 + x4;
			System.out.println("YES\n" + (s / 2) + "\n" + (s - s / 2) + "\n"
					+ x4);
		} else if (n == 2) {
			solve2();
		} else if (n == 3) {
			solve3();
		} else {
			solve4();
		}
	}

	private static void solve3() {
		int arr[] = new int[3];
		arr[0] = in.nextInt();
		arr[1] = in.nextInt();
		arr[2] = in.nextInt();
		Arrays.sort(arr);

		if (arr[2] == 3 * arr[0]) {
			System.out.println("YES");
			System.out.println(arr[2] + arr[0] - arr[1]);
			return;
		}
		if (arr[2] > arr[0] * 3) {
			System.out.println("NO");
			return;
		}

		if (arr[1] + arr[2] == arr[0] * 4) {
			System.out.println("YES");
			System.out.println(arr[0] * 3);
			return;
		}
		if (arr[2] % 3 == 0 && arr[1] + arr[0] == arr[2] * 4 / 3) {
			System.out.println("YES");
			System.out.println(arr[2] / 3);
			return;
		}
		System.out.println("NO");
		return;
	}

	private static void solve4() {
		int arr[] = new int[4];

		arr[0] = in.nextInt();
		arr[1] = in.nextInt();
		arr[2] = in.nextInt();
		arr[3] = in.nextInt();
		Arrays.sort(arr);
		if (arr[0] + arr[3] == arr[1] + arr[2] && arr[3] == 3 * arr[0]) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	private static void solve2() {
		int a = in.nextInt();
		int b = in.nextInt();
		if (((a + b) % 4 == 0)) {
			int x1 = (a + b) / 4;
			int x2 = Math.min(a, b);
			int x3 = Math.max(a, b);
			int x4 = 3 * x1;
			if (x1 > a || x1 > b || x4 < a || x4 < b) {
				System.out.println("NO");
				return;
			}
			System.out.println("YES");
			System.out.println(x1);
			System.out.println(x4);
			return;
		}

		int min = Math.min(a, b);
		int max = Math.max(a, b);
		if (max == 3 * min) {
			int x2 = (min + max) / 2;
			int x3 = (min + max - x2);
			System.out.println("YES");
			System.out.println(x2);
			System.out.println(x3);
			return;
		}

		if (max < 3 * min) {
			int x4 = 3 * min;
			int x3 = (min + x4 - max);
			System.out.println("YES");
			System.out.println(x3);
			System.out.println(x4);
		} else {
			System.out.println("NO");
		}

	}
}
