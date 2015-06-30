import java.util.Scanner;

public class A432 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int max = 5 - k;
		int count = 0;
		for (int i = 0; i < n; ++i) {
			if (in.nextInt() <= max) {
				count++;
			}
		}
		System.out.println(count/3);

	}

}
