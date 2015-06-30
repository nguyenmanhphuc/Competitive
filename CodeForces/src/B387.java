import java.util.PriorityQueue;
import java.util.Scanner;

public class B387 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		PriorityQueue<Integer> need = new PriorityQueue<>();
		PriorityQueue<Integer> had = new PriorityQueue<>();
		for (int i = 0; i < n; ++i) {
			need.add(-in.nextInt());
		}

		for (int i = 0; i < m; ++i) {
			had.add(-in.nextInt());
		}

		int count = 0;
		while (!had.isEmpty()) {
			if (need.isEmpty()) {
				break;
			}
			int hardestLeftProblem = need.poll();
			if (had.peek() > hardestLeftProblem) {
				count++;
			} else {
				had.poll();
			}
		}
		System.out.println(count+need.size());

	}
}
