import java.util.Scanner;

public class A46 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int cur = 0;
		int nextStep = 1;
		for (int i = 1; i < n; ++i) {
			if (i > 1) {
				System.out.print(' ');
			}
			cur = (cur + nextStep) % n;
			System.out.print(cur + 1);
			nextStep++;
		}
		System.out.println();

	}
}
