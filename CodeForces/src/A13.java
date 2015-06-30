import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class A13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		long sum = 0;
		for (int i = 2; i < a; ++i) {
			sum += getSum(a, i);
		}

		long number = a - 2;

		long gcd = gcd(sum, number);
		System.out.println(sum / gcd + "/" + number / gcd);
	}

	private static long gcd(long sum, long number) {
		return sum % number == 0 ? number : gcd(number, sum % number);
	}

	private static long getSum(int a, int i) {
		long sum = 0;
		while (a > 0) {
			sum += a % i;
			a /= i;
		}
		return sum;
	}

}
