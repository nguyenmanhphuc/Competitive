import java.util.Scanner;

public class A441 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		StringBuilder str = new StringBuilder();
		int v = in.nextInt();
		for (int i = 1; i <= n; ++i) {
			int k = in.nextInt();
			boolean canDeal = false;
			for (int j = 0; j < k; ++j) {
				int temp = in.nextInt();
				if (temp < v) {
					canDeal = true;
				}
			}
			if (canDeal) {
				count++;
				if (count > 1) {
					str.append(' ');
				}
				str.append(i);
			}
		}
		System.out.println(count);
		System.out.println(str);

	}

}
