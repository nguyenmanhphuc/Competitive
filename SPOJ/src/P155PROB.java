import java.util.Scanner;

public class P155PROB {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long s = in.nextLong();
		long k = in.nextLong();
		long arr[] = new long[5];
		System.out.print(in.nextLong()- k * s );
		for (int i = 1; i < 5; ++i) {
			System.out.print(" " + (in.nextLong()- k * s ));
		}
		System.out.println();

	}

}
