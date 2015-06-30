import java.util.Scanner;

public class A152 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		char[][] score = new char[n][m];
		for (int i = 0; i < n; ++i) {
			score[i] = in.next().toCharArray();
		}

		int maxPerSubject[] = new int[m];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				maxPerSubject[j] = Math.max(maxPerSubject[j], score[i][j]);
			}
		}

		int count = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				if (score[i][j] == maxPerSubject[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
