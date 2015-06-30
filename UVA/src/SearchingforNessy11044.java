import java.util.Scanner;

public class SearchingforNessy11044 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int cas = 0; cas < t; ++cas) {
			long n = in.nextLong();
			long m = in.nextLong();
			long result = (n) / 3 * (m / 3);
			System.out.println(result);
		}

	}

}
