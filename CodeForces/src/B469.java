import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class B469 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int q = in.nextInt();
		int left = in.nextInt();
		int right = in.nextInt();
		int count = 0;
		HashSet<Integer> hash = new HashSet<>();
		for (int i = 0; i < p; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			for (int j = a; j <= b; ++j) {
				hash.add(j);
			}
		}

		List<Integer> times = new ArrayList<>();
		for (int i = 0; i < q; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			for (int j = a; j <= b; ++j) {
				times.add(j);
			}
		}
		for (int i = left; i <= right; ++i) {
			for (Integer time : times) {
				if (hash.contains(time + i)) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);

	}

	static class Segment {
		public int a;
		public int b;

		public Segment(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}
	}

}
