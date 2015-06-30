import java.util.Scanner;

public class A402 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int v = in.nextInt();

		int minSec = (a + v - 1) / v;
		int maxSupportSec = b / (k - 1) * k + b % (k - 1) + 1;
		if (maxSupportSec > minSec) {
			System.out.println((minSec + k - 1) / k);
		} else {
			int count = b / (k - 1) + 1;
			count+=minSec-maxSupportSec;
			System.out.println(count);
		}

	}
}
