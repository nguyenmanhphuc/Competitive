public class ARRAY {
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

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int count = 0;
		do {
			if (arr[1] * 13 % arr[2] != 0 || arr[6] * arr[7] % arr[8] != 0) {
				continue;
			}

			if (arr[0] + arr[1] * 13 % arr[2] + arr[3] + 12 * arr[4] - arr[5]
					- 11 + arr[6] * arr[7] % arr[8] - 10 == 6) {
				count++;
			}
		} while (next_permutation(arr));
		System.out.println(count);
	}
}
