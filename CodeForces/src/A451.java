import java.util.Scanner;

public class A451 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int m = in.nextInt();
		int min = Math.min(m, n);

		System.out.println(min % 2 == 0 ? "Malvika" : "Akshat");

	}

}
