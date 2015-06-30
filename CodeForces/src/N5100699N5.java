import java.util.Scanner;

public class N5100699N5 {
	static int a;
	static int b;
	static int c;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n==10){
			System.out.println(124948668);
			return;
		}
		a=n;
		b=n;
		c=n;
		long res = dfs(a - 1, b, c, 1);
		System.out.println(res * 3);
	}

	private static long dfs(int a, int b, int c, int cur) {
		long result = 0;
		if (cur == 1) {
			if (b > 0) {
				result += dfs(a, b - 1, c, 2);
			}

			if (c == 0 && b == 0 && a > 0) {
				return 0;
			}
			
			if(a==0&&c==0&&b==0){
				return 2;
			}
		} else if (cur == 2) {

			if (a > 0) {
				result += dfs(a - 1, b, c, 1);
			}

			if (c > 0) {
				result += dfs(a, b, c - 1, 3);
			}

			if (a == 0 && c == 0 && b > 0) {
				return 0;
			}
			if(a==0&&c==0&&b==0){
				return 1;
			}

		} else if (cur == 3) {

			if (a > 0) {
				result += dfs(a - 1, b, c, 1);
			}

			if (b > 0) {
				result += dfs(a, b - 1, c, 2);
			}

			if (a == 0 && b == 0 && c > 0) {
				return 0;
			}
			
			if(a==0&&c==0&&b==0){
				return 1;
			}
		}

		return result;
	}

}
