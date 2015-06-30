import java.util.Scanner;

public class Zapping12468 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		while (a >= 0 && b >= 0) {
			System.out
					.println(Math.min(Math.abs(a - b), 100 - Math.abs(a - b)));
			a = in.nextInt();
			b = in.nextInt();
		}

	}

}
