import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int cas = 1; cas <= t; ++cas) {
			int levels = in.nextInt();
			char[] audiences = in.next().toCharArray();
			int count = 0;
			int countStandedAudiences = 0;
			for (int i = 0; i <= levels; ++i) {
				if (audiences[i] == '0') {
					continue;
				}

				if (countStandedAudiences >= i) {
					countStandedAudiences += audiences[i] - '0';
					continue;
				}

				count += i - countStandedAudiences;
				countStandedAudiences = i + audiences[i] - '0';
			}
			System.out.println("Case #" + cas + ": " + count);
		}

	}
}
