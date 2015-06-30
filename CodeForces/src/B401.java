import java.util.Scanner;

public class B401 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int visted[] = new int[n + 1];
		int k = in.nextInt();
		for (int i = 0; i < k; ++i) {
			int type = in.nextInt();
			if (type == 1) {
				visted[in.nextInt()] = 2;
				visted[in.nextInt()] = 1;
			} else {
				visted[in.nextInt()] = 2;
			}
		}
		visted[0] = 1;
		visted[n] = 2;
		int pre = 0;
		int min = 0;
		int max = 0;
		for (int i = 1; i <= n; ++i) {
			if (visted[i] > 0) {
				max += i - pre - 1;

				min += (i - pre) / 2;

				pre = i;
			}
		}
		System.out.println(min + " " + max);

	}
}
