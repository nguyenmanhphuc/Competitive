import java.util.Scanner;

public class A25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int countOdd = 0;
		int countEven = 0;
		int odd = 0;
		int even = 0;
		for (int i = 0; i < n; ++i) {
			int temp = in.nextInt();
			if ((temp & 1) == 0) {
				even = i + 1;
				countEven++;
			} else {
				odd = i + 1;
				countOdd++;
			}
		}
		System.out.println(countEven == 1 ? even : odd);

	}
}
