import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class G100694 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int curNode = in.nextInt();
		Stack<Integer> node = new Stack<>();
		node.add(curNode);
		PrintWriter writer = new PrintWriter(System.out);
		int limit = n << 1;
		for (int i = 1; i < limit; ++i) {
			s = in.next();
			int nextNode = in.nextInt();
			if (s.equals("in")) {
				writer.println(node.peek() + " " + nextNode);
				node.add(nextNode);
			} else {
				node.pop();
			}
		}
		writer.close();

	}

}
