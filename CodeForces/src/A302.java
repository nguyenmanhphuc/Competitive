import java.util.Scanner;

public class A302 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int arr[] = new int[n + 1];
		int countNegative = 0;
		int countPos = 0;
		for (int i = 1; i <= n; ++i) {
			arr[i] = in.nextInt();
			if (arr[i] == 1) {
				countPos++;
			} else {
				countNegative++;
			}
		}
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < m; ++i) {
			int l = in.nextInt();
			int r = in.nextInt();
			int length = r - l + 1;
			if ((length & 1) == 0 && length / 2 <= countNegative
					&& length / 2 <= countPos) {
				str.append(1);
				str.append('\n');

			} else {
				str.append(0);
				str.append('\n');
			}
		}
		System.out.print(str);

	}
}
