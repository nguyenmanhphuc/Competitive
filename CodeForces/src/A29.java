import java.util.Scanner;

public class A29 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int camels[] = new int[100001];
		for (int i = 0; i < n; ++i) {
			int x = in.nextInt();
			int d = in.nextInt();
			x += 40000;
			camels[x] = d;
		}

		for (int i = 0; i <= 100000; ++i) {
			if (camels[i] == 0) {
				continue;
			}

			if (camels[i + camels[i]] == -camels[i]) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}
