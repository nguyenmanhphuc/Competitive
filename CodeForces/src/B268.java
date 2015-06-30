import java.util.Scanner;

public class B268 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long count = 0;
		for (int i = 0; i < n; ++i) {
			count += (i + 1) * (n - i) - i;
		}
		System.out.println(count);
	}

}
