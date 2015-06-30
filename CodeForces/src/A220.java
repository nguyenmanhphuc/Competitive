import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class A220 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        Integer[] b = Arrays.copyOf(a, n);
        Arrays.sort(b);
        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (a[i].intValue() != b[i].intValue()) {
                count++;
            }
        }
    
        System.out.println(count == 0 || count == 2 ? "YES" : "NO");

	}

	static class Pair implements Comparable<Pair> {
		public int value;
		public int index;

		public Pair(int value, int index) {
			super();
			this.value = value;
			this.index = index;
		}

		@Override
		public int compareTo(Pair p) {
			if (this.value != p.value) {
				return this.value - p.value;
			}

			return this.index - p.index;
		}

	}

	static class Pair1 implements Comparable<Pair1> {
		public int value;
		public int index;
		public int expect;

		public Pair1(int value, int index, int expect) {
			super();
			this.value = value;
			this.index = index;
			this.expect = expect;
		}

		@Override
		public int compareTo(Pair1 p) {
			if (this.expect != p.expect) {
				return this.expect - p.expect;
			}

			return this.value - p.value;
		}
	}

}
