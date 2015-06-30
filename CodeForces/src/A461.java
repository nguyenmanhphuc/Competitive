import java.util.Arrays;
import java.util.Scanner;

public class A461 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		Integer[] numbers = new Integer[n];
		long sum = 0;
		for (int i = 0; i < n; ++i) {

			numbers[i] = in.nextInt();
			sum += numbers[i];
		}
		Arrays.sort(numbers);
		long total = sum;
		for (int i = 0; i < n - 1; ++i) {
			total += sum;
			sum -= numbers[i];
		}
		System.out.println(total);

	}

}
