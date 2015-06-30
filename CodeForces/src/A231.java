import java.util.Scanner;

public class A231 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int countSolveableProblem = 0;
		for (int i = 0; i < n; ++i) {
			if (in.nextInt() + in.nextInt() + in.nextInt() >= 2) {
				countSolveableProblem++;
			}
		}
		System.out.println(countSolveableProblem);

	}

}
