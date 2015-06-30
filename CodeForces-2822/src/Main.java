import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int arr[] = { 2, 7, 2, 3, 3, 4, 2, 5, 1, 2 };
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = n % 10;
		int b = n / 10;
		System.out.println(arr[a] * arr[b]);
	}
}
