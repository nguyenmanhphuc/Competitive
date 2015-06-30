import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class D4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int w = in.nextInt();
		int h = in.nextInt();

		En[] ens = new En[n];
		for (int i = 0; i < n; ++i) {
			ens[i] = new En(in.nextInt(), in.nextInt(), i + 1);
		}

		Arrays.sort(ens);
		Result[] results = new Result[n];
		int maxPos = 0;

		for (int i = 0; i < n; ++i) {
			results[i] = new Result();
			results[i].pre = -1;
			if (ens[i].w > w && ens[i].h > h) {
				for (int j = 0; j < i; ++j) {
					if (ens[j].w < ens[i].w && ens[j].h < ens[i].h
							&& results[j].count > results[i].count) {
						results[i].count = results[j].count;
						results[i].pre = j;
					}
				}

				results[i].count = results[i].count + 1;
				if (results[i].count > results[maxPos].count) {
					maxPos = i;
				}
			}
		}

		if (results[maxPos].count == 0) {
			System.out.println(0);
		} else {
			int max = results[maxPos].count;
			Stack<Integer> stack = new Stack<>();
			do {
				stack.add(ens[maxPos].index);
				maxPos = results[maxPos].pre;
			} while (maxPos >= 0);

			StringBuilder str = new StringBuilder();
			boolean has = false;
			while (!stack.isEmpty()) {
				if (has) {
					str.append(" ");
				} else {
					has = true;
				}
				str.append(stack.pop());

			}
			System.out.println(max);
			System.out.println(str.toString());
		}
	}
}

class En implements Comparable<En> {
	int w;
	int h;
	int index;

	public En(int w, int h, int index) {
		super();
		this.w = w;
		this.h = h;
		this.index = index;
	}

	@Override
	public int compareTo(En e) {
		if (w < e.w) {
			return -1;
		} else if (w > e.w) {
			return 1;
		} else if (h > e.h) {
			return 1;
		} else if (h < e.h) {
			return -1;
		}
		return 0;
	}

}

class Result {
	public int count;
	public int pre;

	public Result(int count, int pre) {
		super();
		this.count = count;
		this.pre = pre;
	}

	public Result() {
		pre = -1;
		count = 0;
	}
}
