import java.util.Scanner;

public class B431 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[] { 0, 1, 2, 3, 4 };
		int matrix[][] = new int[5][5];
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				matrix[i][j] = in.nextInt();
			}
		}
		int max = 0;
		do {
			int cur = 0;
			for (int i = 0; i < 4; ++i) {
				for (int j = i; j < 4; j += 2) {
					cur += matrix[arr[j]][arr[j + 1]];
					cur += matrix[arr[j + 1]][arr[j]];
				}
			}
			max = Math.max(cur, max);
		} while (next_permutation(arr));
		System.out.println(max);
	}

	static boolean next_permutation(int[] p) {
		for (int a = p.length - 2; a >= 0; --a)
			if (p[a] < p[a + 1])
				for (int b = p.length - 1;; --b)
					if (p[b] > p[a]) {
						int t = p[a];
						p[a] = p[b];
						p[b] = t;
						for (++a, b = p.length - 1; a < b; ++a, --b) {
							t = p[a];
							p[a] = p[b];
							p[b] = t;
						}
						return true;
					}
		return false;
	}
}
