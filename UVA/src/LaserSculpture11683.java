import java.util.Scanner;
import java.util.Stack;

public class LaserSculpture11683 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		while (h != 0) {
			Stack<Integer> stack = new Stack<Integer>();
			stack.add(h);
			int cols = in.nextInt();
			long result = 0;
			int size = 1;
			for (int i = 0; i < cols; ++i) {
				int t = in.nextInt();
				while (size > 0 && stack.peek() < t) {
					int pre = stack.pop();
					int pr = stack.peek();
					result += Math.min(pr, t) - pre;
					size--;
				}

				stack.add(t);
				size++;
			}
			int t = h;
			while (size > 0 && stack.peek() < t) {
				int pre = stack.pop();
				int pr = stack.peek();
				result += Math.min(pr, t) - pre;
				size--;
			}
			System.out.println(result);
			h = in.nextInt();
		}
	}
}
