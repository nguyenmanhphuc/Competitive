import java.util.Scanner;

public class A489 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
		}
		int count = 0;
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			int iMin = i;
			for (int j = i+1; j < n; ++j) {
				if (arr[iMin] > arr[j]) {
					iMin = j;
				}
			}

			if (iMin != i) {
				str.append(i + " " + iMin);
				int t = arr[i];
				arr[i] = arr[iMin];
				arr[iMin] = t;
				str.append('\n');
				count++;
			}
		}
		System.out.println(count);
		if (count > 0) {
			System.out.print(str);
		}
	}

}
