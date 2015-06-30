import java.util.Scanner;

public class B368 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n + 2];
		int[] count = new int[n + 2];
		boolean appeared[] = new boolean[100001];
		for (int i = 1; i <= n; ++i) {
			a[i] = in.nextInt();

		}
		StringBuilder str = new StringBuilder();
		for (int i = n; i >= 1; --i) {
			if (!appeared[a[i]]) {
				count[i] = 1;
				appeared[a[i]] = true;
			} 
			count[i] += count[i + 1];
		}
		for (int i = 0; i < m; ++i) {
			int index = in.nextInt();
			str.append(count[index]);
			str.append('\n');
		}
		System.out.print(str);

	}
}
