import java.util.Scanner;

public class A318 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long k = in.nextLong();
		long countOdd = (n + 1) / 2;
		long countEven = n - countOdd;
		if (k <= countOdd) {
			System.out.println(1 + (k - 1) * 2);
		} else {
			long index = countOdd + 1;
			System.out.println(2 + (k - index) * 2);
		}

	}

}
