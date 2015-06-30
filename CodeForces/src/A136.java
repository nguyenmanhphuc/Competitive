import java.util.Scanner;

public class A136 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result[] = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			result[in.nextInt()] = i;
		}

		StringBuilder str = new StringBuilder();
		str.append(result[1]);
		for (int i = 2; i <= n; ++i) {
			str.append(" " + result[i]);
		}
		System.out.println(str);
	}

}
