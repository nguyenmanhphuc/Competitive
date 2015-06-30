import java.util.Scanner;

public class BCTEST14_EN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int v = in.nextInt();
		long result = (v < a) ? 1 : ((v - a + (a - b) - 1) / (a - b) + 1);
		System.out.println(result);

	}

}
