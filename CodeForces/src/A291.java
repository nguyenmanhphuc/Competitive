import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A291 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] ids = new int[n];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; ++i) {
			ids[i] = in.nextInt();
			if (ids[i] == 0) {
				continue;
			}
			Integer count = map.get(ids[i]);

			if (count == null) {
				map.put(ids[i], 1);
			} else {
				count += 1;
				map.put(ids[i], count);
			}
		}

		int count1 = 0;
		int count2 = 0;
		for (int i : ids) {
			if (i == 0)
				continue;
			Integer count = map.get(i);
			if (count == null) {
				continue;
			}
			if (count > 2) {
				System.out.println(-1);
				return;
			} else if (count == 2) {
				count2++;
			} else if (count == 1) {
				count1++;
			}
		}
		System.out.println((count2 >> 1));
	}
}
