import java.util.Scanner;

public class B451 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n + 2];
		int index = -1;
		for (int i = 1; i <= n; ++i) {
			arr[i] = in.nextInt();
			if (index < 0 && arr[i] < arr[i - 1]) {
				index = i - 1;
			}
		}
		arr[n + 1] = Integer.MAX_VALUE;
		int index2 = -1;
		for (int i = n + 1; i > 0; --i) {
			if (arr[i - 1] > arr[i]) {
				index2 = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("yes\n1 1");
			return;
		}

		int i = index;
		int j = index2;
		while (i < j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}

		for (i = 1; i <= n; ++i) {
			if (arr[i] < arr[i - 1]) {
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
		System.out.println(index + " " + index2);
	}
}
