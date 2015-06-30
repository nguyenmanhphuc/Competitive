import java.util.Scanner;

public class SaveSetu12403 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long m = 0;
		for (int i = 0; i < n; ++i) {
			String s = in.next();
			if (s.equals("report")) {
				System.out.println(m);
			} else {
				m += in.nextLong();
			}
		}

	}

}
