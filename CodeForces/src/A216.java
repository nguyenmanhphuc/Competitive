import java.util.Scanner;

public class A216 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		int result = (c + 1 - a) * (a + b - 1);
		result += (a + b - 2 + b) * (a - 1) / 2 * 2;
		System.out.println(result);

	}

}
