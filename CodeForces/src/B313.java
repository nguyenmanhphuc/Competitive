import java.util.Scanner;

public class B313 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		int n = s.length;

		int[] arr = new int[n];
		for (int i = 1; i < n; ++i) {
			arr[i] = arr[i - 1] + (s[i] == s[i - 1] ? 1 : 0);
		}

		int q = in.nextInt();
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < q; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			str.append(arr[b - 1] - arr[a - 1]);
			str.append('\n');
		}
		System.out.print(str);

	}

}
