import java.util.Scanner;

public class A485 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int m = in.nextInt();
		boolean arr[] = new boolean[m];
		while (a % m != 0) {
			if (arr[a % m]) {
				System.out.println("No");
				return;
			}
			arr[a % m] = true;
			a = (a + a % m) % m;
		}
		System.out.println("Yes");
	}
}
