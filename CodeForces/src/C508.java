import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class C508 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int s = in.nextInt();
		int r = in.nextInt();

		if (s < r) {
			System.out.println(-1);
			return;
		}

		int w[] = new int[n];
		for (int i = 0; i < n; ++i) {
			w[i] = in.nextInt();
		}

		int count = 0;
		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 0; i < n; ++i) {
			while (queue.size() > 0 && queue.peek() < w[i]) {
				queue.poll();
			}
			int size = queue.size();
			int time = w[i] - (r - size);

			int more = r - size;
			count += more;
			for (int j = time + 1; j <= w[i]; ++j) {
				queue.add(j + s-1);
			}
		}
		System.out.println(count);
	}
}
