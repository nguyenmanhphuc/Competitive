import java.util.Scanner;

public class JumpingMario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int cas = 1; cas <= t; ++cas) {
			int n = in.nextInt();
			int highJumps = 0;
			int lowJumps = 0;
			int pre = in.nextInt();
			for (int i = 1; i < n; ++i) {
				int temp = in.nextInt();
				if (temp > pre) {
					highJumps++;
				} else if (temp < pre) {
					lowJumps++;
				}
				pre = temp;
			}
			System.out.println("Case " + cas + ": " + highJumps + " "
					+ lowJumps);
		}
	}

}
