import java.util.Scanner;

public class B131 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long arr[] = new long[21];
		for (int i = 0; i < n; ++i) {
			arr[in.nextInt() + 10]++;
		}
		long total = 0;
		for (int i = 0; i < 10; ++i) {
			total += arr[i] * arr[20 - i];
		}
		total += arr[10] * (arr[10] - 1) / 2;
		System.out.println(total);
	}

}
