import java.util.Scanner;

public class A379 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(a + (a - 1) / (b - 1));
	}

}
