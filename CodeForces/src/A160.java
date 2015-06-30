import java.util.Arrays;
import java.util.Scanner;

public class A160 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		long sumValues = 0;
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
			sumValues += arr[i];
		}
		double need = sumValues * 1.0 / 2;

		Arrays.sort(arr);
		int count = 0;
		sumValues = 0;
		for (int i = n - 1; i >= 0; --i) {
			if (sumValues > need) {
				break;
			}
			count++;
			sumValues += arr[i];
		}
		System.out.println(count);

	}

}
