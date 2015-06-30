import java.util.Scanner;

public class A82 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long temp = 1;
		while (n > 5*temp) {
			n -= temp * 5;
			temp *= 2;
		}

		String[] names = { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
		System.out.println(names[(int) ((n + temp - 1) / temp-1)]);

	}

}
