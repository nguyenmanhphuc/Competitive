import java.util.Scanner;

public class A460 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		System.out.println(n + (n - 1) / (m - 1));

	}

}
