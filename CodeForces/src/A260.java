import java.util.Scanner;

public class A260 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int n = in.nextInt();
		int mod = a * 10 % b;
		StringBuilder str = new StringBuilder();
		str.append(a);
		if (mod > 0 && b - mod >= 10) {
			System.out.println(-1);
			return;
		} else if (mod == 0) {
			str.append(0);
		} else {
			str.append(b- mod);
		}

		
		for (int i = 1; i < n; ++i) {
			str.append(0);
		}
		System.out.println(str);

	}
}
