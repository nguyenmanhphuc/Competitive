import java.util.Scanner;

public class PackingforHoliday12372 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cas = 1;
		int t = in.nextInt();
		for (int i = 0; i < t; ++i) {
			int l = in.nextInt();
			int w = in.nextInt();
			int h = in.nextInt();
			if (l <= 20 && w <= 20 && h <= 20) {
				System.out.println("Case " + cas++ + ": good");
			} else {
				System.out.println("Case " + cas++ + ": bad");
			}
		}

	}

}
