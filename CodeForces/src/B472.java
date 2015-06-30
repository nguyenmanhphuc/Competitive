import java.util.Arrays;
import java.util.Scanner;

public class B472 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		Integer[] floors = new Integer[n];
		long result = 0;
		for (int i = 0; i < n; ++i) {
			floors[i] = in.nextInt();
		}
		Arrays.sort(floors);
		int index = 0;
		int cur = 1;
		while (n > 0) {
			result += (n + k - 1) / k * (floors[index] - cur) << 1;
			n -= 1;
			cur = floors[index++];
		}
		System.out.println(result);

	}

}
