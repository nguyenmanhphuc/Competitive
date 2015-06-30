import java.util.Scanner;

public class TariffPlan12157 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int cas = 1; cas <= t; ++cas) {
			int n = in.nextInt();
			int mile = n * 10;
			int juice = n * 15;
			for (int i = 0; i < n; ++i) {
				int length = in.nextInt();
				mile += length / 30 * 10;
				juice += length / 60 * 15;
			}
			String r;
			if (mile < juice) {
				r = "Mile " + mile;
			} else if (mile > juice) {
				r = "Juice " + juice;
			} else {
				r = "Mile Juice " + mile;
			}
			System.out.println("Case " + cas + ": " + r);
		}

	}
}
