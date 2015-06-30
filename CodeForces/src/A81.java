import java.util.Scanner;
import java.util.Stack;

public class A81 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] str = in.next().toCharArray();
		int length = str.length;
		Stack<Character> stack = new Stack<Character>();

		for (Character c : str) {
			if (stack.isEmpty()) {
				stack.add(c);
			} else if (stack.peek().equals(c)) {
				stack.pop();
			} else {
				stack.add(c);
			}
		}

		StringBuilder result = new StringBuilder();
		while (!stack.isEmpty()) {
			result.append(stack.pop());
		}
		System.out.println(result.reverse());
	}

}
