import java.util.Scanner;

public class Prerequisites10919 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k;
		while ((k = in.nextInt()) != 0) {
			int m = in.nextInt();
			boolean course[] = new boolean[10000];
			for (int i = 0; i < k; ++i) {
				course[in.nextInt()] = true;
			}
			boolean check = true;
			int categories[] = new int[m + 1];
			for (int i = 0; i < m; ++i) {
				int c = in.nextInt();
				int r = in.nextInt();
				for (int j = 0; j < c; ++j) {
					int temp = in.nextInt();
					if (course[temp] == true) {
						r--;
					}
				}
				if (r > 0) {
					check = false;
				}
			}
			if (check) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}

	}
}
