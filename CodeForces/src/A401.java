import java.util.Scanner;

public class A401 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int limit = in.nextInt();
		int sum = 0;
		for (int i = 0; i < n; ++i) {
			sum += in.nextInt();
		}
		sum  = Math.abs(sum);
		System.out.println((sum + limit-1) / limit);

	}

}
