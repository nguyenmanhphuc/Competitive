import java.util.Scanner;

public class A349 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count[] = new int[101];
		for (int i = 0; i < n; ++i) {
			int temp = in.nextInt();
			count[temp]++;
			temp -= 25;
			if (temp == 75) {
				if (count[50] > 0) {
					count[50]--;
					count[25]--;
				} else {
					count[25] -= 3;
				}

			} else if (temp == 25) {
				count[25]--;
			}

			if (count[50] < 0 || count[25] < 0) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

	}
}
