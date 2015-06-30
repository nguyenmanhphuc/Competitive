import java.util.Scanner;

public class A385 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = in.nextInt();
		int cur = in.nextInt();
		int max = 0;
		for (int i = 1; i < n; ++i) {
			int temp = in.nextInt();
			max = Math.max(max, cur - temp);
			cur = temp;
		}
		System.out.println(max - c > 0 ? max - c : 0);

	}
}
