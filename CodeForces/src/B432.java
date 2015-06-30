import java.util.Scanner;

public class B432 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] home = new int[n];
		int[] away = new int[n];
		int countHome[] = new int[100001];
		int countAway[] = new int[100001];
		for (int i = 0; i < n; ++i) {
			home[i] = in.nextInt();
			away[i] = in.nextInt();
			countHome[home[i]]++;
			countAway[away[i]]++;
		}

		StringBuilder str = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			int h = n - 1 + countHome[away[i]];
			int a = n - 1 - countHome[away[i]];
			str.append(h + " " + a + "\n");
		}
		System.out.print(str);
	}
}
