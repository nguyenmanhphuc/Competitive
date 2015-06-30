import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B546 {

	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Map<Integer, Integer> map = new HashMap<>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; ++i) {
			int t = in.nextInt();
			if (!map.containsKey(t)) {
				map.put(t, 1);
			} else {
				map.put(t, map.get(t) + 1);
			}
		}
		int cost = 0;
		int count = 1;
		int i = 1;
		while (count < n) {
			Integer t = map.get(i);
			if (t == null || t == 0) {
				i++;
				continue;
			}

			count++;
			cost += t - 1;
			Integer cur = map.get(i + 1);

			map.put(i + 1, t - 1 + (cur != null ? cur : 0));
			i++;
		}
		System.out.println(cost);
	}

	static void solveSorting() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] badges = new Integer[n];
		for (int i = 0; i < n; ++i) {
			badges[i] = in.nextInt();
		}
		Arrays.sort(badges);

		int cost = 0;
		for (int i = 1; i < n; ++i) {
			if (badges[i] <= badges[i - 1]) {
				cost += badges[i - 1] + 1 - badges[i];
				badges[i] = badges[i - 1] + 1;
			}
		}
		System.out.println(cost);
	}

}
