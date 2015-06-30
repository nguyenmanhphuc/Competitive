import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZerosandOnes10324 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int cas = 1;
		StringBuilder str = new StringBuilder();
		while (in.hasNext()) {
			char[] s = in.next().toCharArray();
			if (s.length == 0) {
				break;
			}
			System.out.println("Case " + cas++ + ":");
			int q = in.nextInt();
			solve(s, q);
		}
	}

	private static void solve(char[] s, int q) {
		int length = s.length;
		List<Integer>[] listIndices = new List[2];
		listIndices[0] = new ArrayList<Integer>();
		listIndices[1] = new ArrayList<Integer>();
		int end = length - 1;
		for (int i = 0; i < end; ++i) {
			if (s[i] != s[i + 1]) {
				listIndices[s[i] - '0'].add(i);
			}
		}
		listIndices[s[end] - '0'].add(end);
		for (int i = 0; i < q; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();

			int left = Math.min(a, b);
			int right = Math.max(a, b);
			if (left > end) {
				System.out.println("Yes");
				return;
			}
			if (right > end) {
				right = end;
			}
			int index = upperBound(listIndices[s[left] - '0'], left);
			if (index >= right) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

	private static int upperBound(List<Integer> list, int key) {
		int l = 0;
		int r = list.size() - 1;
		while (l < r) {
			int mid = (l + r) >> 1;
			if (list.get(mid) >= key) {
				r = mid;
			} else {
				l = mid + 1;
			}

		}
		return list.get(l);
	}
}
