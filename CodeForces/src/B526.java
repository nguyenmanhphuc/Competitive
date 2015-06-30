import java.util.Scanner;

public class B526 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = (1 << (n + 1)) - 1;
		int limit[] = new int[count + 1];
		for (int i = 2; i <= count; ++i) {
			limit[i] = in.nextInt();
		}

		int need = 0;
		for (int i = count; i > 1; i -= 2) {
			int tempMax = Math.max(limit[i], limit[i - 1]);
			need += tempMax * 2 - limit[i] - limit[i - 1];
			limit[i / 2] += tempMax;
		}
		System.out.println(need);
	}
}
