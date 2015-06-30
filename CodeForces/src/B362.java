import java.util.HashSet;
import java.util.Scanner;

public class B362 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < m; ++i) {
			int t = in.nextInt();
			if (t == 1 || t == n || (hs.contains(t + 1) && hs.contains(t + 2))
					|| (hs.contains(t + 1) && hs.contains(t - 1))
					|| (hs.contains(t - 1) && hs.contains(t - 2))) {
				System.out.println("NO");
				return;
			}
			hs.add(t);
		}
		System.out.println("YES");

	}
}
