import java.util.Scanner;

public class A465A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char arr[] = in.next().toCharArray();
		int end = n - 1;
		for (int i = 0; i < end; ++i) {
			if (arr[i] == '0') {
				System.out.println(i + 1);
				return;
			}
		}
		System.out.println(n);
	}

}
