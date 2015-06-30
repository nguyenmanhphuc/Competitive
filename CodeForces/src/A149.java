import java.util.Arrays;
import java.util.Scanner;

public class A149 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int[] months = new int[12];
		int sum = 0;
		for (int i = 0; i < 12; i++) {
			months[i] = in.nextInt();
			sum += months[i];
		}
		
		if (sum < k) {
			System.out.println(-1);
			return;
		}

		Arrays.sort(months);
		
		int count = 0;
		while (k > 0) {
			k -= months[11 - count];
			count++;
		}
		System.out.println(count);
	}

}
