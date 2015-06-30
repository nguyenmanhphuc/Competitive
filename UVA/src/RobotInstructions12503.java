import java.util.Scanner;

public class RobotInstructions12503 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int cas = 1; cas <= t; ++cas) {
			int n = in.nextInt();
			String[] instrustions = new String[n + 1];
			int pos = 0;
			for (int i = 1; i <= n; ++i) {
				instrustions[i] = in.next();
				int resultCompare = instrustions[i].compareTo("RIGHT");
				if (resultCompare == 0) {
					pos++;
				} else if (resultCompare > 0) {
					in.next();
					int p = in.nextInt();
					instrustions[i] = instrustions[p];
					if (instrustions[i].equals("RIGHT")) {
						pos++;
					} else {
						pos--;
					}
				} else {
					pos--;
				}
			}
			System.out.println(pos);

		}
	}
}
