import java.util.Scanner;

public class C483 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int z = n - k;
		int temp = 1;
		StringBuilder str = new StringBuilder();
		str.append(1);
		int left = 2;
		int right = n;
		int m = n - k - 1;
		for (int i = 0; i < m; ++i) {
			str.append(" ");
			str.append(left++);

		}

		while (left <= right) {
			str.append(" ");
			str.append(right--);
			if (left <= right) {
				str.append(" ");
				str.append(left++);
			}
		}
		System.out.println(str);
	}
}
