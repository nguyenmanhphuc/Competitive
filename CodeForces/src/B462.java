import java.util.Arrays;
import java.util.Scanner;

public class B462 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long k = in.nextInt();
		long[] count = new long[200];
		char[] cards = in.next().toCharArray();
		for (int i = 0; i < n; ++i) {
			count[cards[i]]++;
		}

		Arrays.sort(count);
		long result = 0;
		int index = 199;
		while (k > 0) {
			if (count[index] > k) {
				result += k * k;
				break;
			}

			result += count[index] * count[index];
			k -= count[index];
			index--;
		}
		System.out.println(result);
	}

}
