import java.util.Scanner;

public class A315 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];

		int arr[] = new int[1001];
		for (int i = 0; i < n; ++i) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			arr[b[i]]++;
		}

		int count = 0;
		for (int i = 0; i < n; ++i) {
			if (arr[a[i]] == 0) {
				count++;
			}
			if (a[i] == b[i] && arr[a[i]] == 1) {
				count++;
			}

		}
		System.out.println(count);
	}

}
