import java.util.Scanner;

public class A501 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int M = Math.max(3 * a / 10, a - a / 250 * c);
		int V = Math.max(3 * b / 10, b - b / 250 * d);

		if (M > V) {
			System.out.println("Misha");
		} else if (M < V) {
			System.out.println("Vasya");
		} else {
			System.out.println("Tie");
		}
	}

}
