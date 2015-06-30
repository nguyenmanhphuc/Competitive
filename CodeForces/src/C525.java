import java.util.Arrays;
import java.util.Scanner;

public class C525 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long arr[] = new long[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextLong();
		}

		Arrays.sort(arr);
		long totalArea = 0;
		long temp = 0;
		for (int i = n - 2; i >= 0; --i) {
			if (arr[i] == arr[i + 1] || arr[i] == arr[i + 1] - 1) {
				if (temp == 0) {
					temp = arr[i];
				} else {
					totalArea += temp * arr[i];
					temp = 0;
				}
				i--;
			} 
		}
		
		System.out.println(totalArea);

	}

}
