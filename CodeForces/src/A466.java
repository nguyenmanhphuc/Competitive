import java.util.Scanner;

public class A466 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();

		if (m * a <= b) {
			System.out.println(n * a);
			return;
		} else {
			int sum = n / m * b;
			int l = n%m;
			sum += l * a > b ? b : l * a;
			System.out.println(sum);
		}
	}

}
