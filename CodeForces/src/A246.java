import java.util.Scanner;

public class A246 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n < 3) {
			System.out.println(-1);
			return;
		}
		System.out.print("2 3 1");
		for (int i = 3; i < n; ++i) {
			System.out.print(" " + (i + 1));
		}
		System.out.println();
	}

}
