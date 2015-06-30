import java.util.Scanner;

public class A124 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = n - a - 1;
		int result = c > b ? b + 1 : c + 1;
		System.out.println(result);

	}

}
