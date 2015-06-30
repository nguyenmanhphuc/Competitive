import java.util.Arrays;
import java.util.Scanner;

public class B381 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr);

		int count = 0;
		StringBuilder str = new StringBuilder();
		str.append(arr[0]);
		int cur = arr[0];
		boolean used[] = new boolean[n];
		used[0] = true;
		for (int i = 0; i < n; ++i) {
			if (cur < arr[i]) {
				str.append(' ');
				str.append(arr[i]);
				used[i] = true;
				cur = arr[i];
				count++;
			}
		}
		for (int i = n - 1; i > 0; --i) {
			if (cur > arr[i] && !used[i]) {
				str.append(' ');
				str.append(arr[i]);
				used[i] = true;
				cur = arr[i];
				count++;
			}
		}
		System.out.println(count + 1);
		System.out.println(str);
	}
}
