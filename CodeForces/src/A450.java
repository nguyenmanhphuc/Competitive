import java.util.Scanner;

public class A450 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int max = 0;
		int a = in.nextInt();
		int index = -1;
		for (int i = 1; i <= n; ++i) {
			int temp = in.nextInt();
			int turns = (temp + a - 1) / a;
			if (turns >= max) {
				max = turns;
				index = i;
			}
		}
		System.out.println(index);
	}
}