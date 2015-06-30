import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class A67 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] students = in.next().toCharArray();

		int[] toffees = new int[n];

		PriorityQueue<P> q = new PriorityQueue<>();
		int cur = 0;
		q.add(new P(0, 0));
		char state = students[0];
		for (int i = 0; i < students.length; ++i) {
			if (state == 'L') {
				cur--;
			} else if (state == 'R') {
				cur++;
			}
			if (students[i] == state || students[i] == '=') {

			} else {
				state = students[i];
				q.add(new P(i, cur));
			}

		}

		q.add(new P(n - 1, cur));

		while (q.size() > 0) {
			int pos = q.poll().index;
			if (toffees[pos] == 0) {
				toffees[pos] = 1;
				int i;
				for (i = pos + 1; i < n && students[i - 1] != 'L'; ++i) {
					if (students[i - 1] == 'R') {
						if (toffees[i] == 0) {
							toffees[i] = toffees[i - 1] + 1;
						} else {
							toffees[i] = Math.max(toffees[i], toffees[i - 1] + 1);
						}
					} else {
						toffees[i] = toffees[i - 1];
					}
				}
				if (i < n && toffees[i] == toffees[i - 1]) {
					toffees[i]++;
				}

				for (i = pos - 1; i >= 0 && students[i] != 'R'; --i) {
					if (students[i] == 'L') {
						if (toffees[i] == 0) {
							toffees[i] = toffees[i + 1] + 1;
						} else {
							toffees[i] = Math.max(toffees[i], toffees[i + 1] + 1);
						}

					} else {
						toffees[i] = toffees[i + 1];
					}
				}

			}
		}
		System.out.print(toffees[0]);
		for (int i = 1; i < n; ++i) {
			System.out.print(" " + toffees[i]);
		}
		System.out.println();

	}
}

class P implements Comparable<P> {
	public int index;
	public int value;

	public P(int index, int value) {
		super();
		this.index = index;
		this.value = value;
	}

	@Override
	public int compareTo(P p) {

		return value - p.value;
	}

}