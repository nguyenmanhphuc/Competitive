import java.util.Scanner;

public class B509 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = in.nextInt();

		int max = 0;
		int min = 100000;
		int arr[] = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}

		if (max - min > c) {
			System.out.println("NO");
			return;
		}
		System.out.println("YES");
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < n; ++i) {
			int index = 1;
			for (int j = 0; j < arr[i]; ++j) {
				if (j > 0) {
					str.append(' ');
				}
				str.append(index);
				if (index == c) {
					index = 1;
				} else {
					index++;
				}
			}
			str.append('\n');
		}
		System.out.print(str);

	}
}
