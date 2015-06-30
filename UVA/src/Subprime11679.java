import java.util.Scanner;

public class Subprime11679 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int b = in.nextInt();
		int c = in.nextInt();
		while (b + c != 0) {

			long banks[] = new long[b + 1];
			for (int i = 1; i <= b; ++i) {
				banks[i] = in.nextLong();
			}

			for (int i = 0; i < c; ++i) {
				int a = in.nextInt();
				int z = in.nextInt();
				int d = in.nextInt();
				banks[a] -= d;
				banks[z] += d;
			}
			boolean check = true;
			for (int j = 1; j <= b; ++j) {
				if (banks[j] < 0) {
					check = false;
				}
			}
			System.out.println(check ? "S" : "N");
			b = in.nextInt();
			c = in.nextInt();
		}

	}
}
