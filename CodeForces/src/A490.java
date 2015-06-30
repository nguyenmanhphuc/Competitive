import java.util.Scanner;
import java.util.Stack;

public class A490 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Stack[] stacks = new Stack[4];
		for (int i = 1; i < 4; ++i) {
			stacks[i] = new Stack<Integer>();
		}

		for (int i = 1; i <= n; ++i) {
			stacks[in.nextInt()].add(i);
		}

		int count = Math.min(Math.min(stacks[1].size(), stacks[2].size()),
				stacks[3].size());

		System.out.println(count);
		for (int i = 0; i < count; ++i) {
			System.out.println(stacks[1].pop() + " " + stacks[2].pop() + " "
					+ stacks[3].pop());
		}

	}

}
