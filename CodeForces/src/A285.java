import java.util.Scanner;

public class A285 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int arr[] = new int[n];
		int cur = 1;

		int i;
		for (i = n - 1; i >= 0 && cur <= k; --i) {
			arr[i] = cur++;
		}
	
		for (int j = 0; j <= i; ++j) {
			arr[j] = cur++;
		}

		StringBuilder str = new StringBuilder();
		str.append(arr[0]);
		for (int j = 1; j < n; ++j) {
			str.append(' ');
			str.append(arr[j]);
		}
		System.out.println(str);

	}

}
