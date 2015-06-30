import java.util.Scanner;

public class A431 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i = 1; i <= 4; ++i) {
			arr[i] = in.nextInt();
		}

		char s[] = in.next().toCharArray();
		int squares = s.length;
		long r = 0;

		for (int i = 0; i < squares; ++i) {
			r += arr[s[i] - '0'];
		}
		System.out.println(r);
	}

}
