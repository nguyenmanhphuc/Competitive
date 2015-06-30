import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A199 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		int i = 2;
		int next;
		do {
			next = list.get(i - 2) + list.get(i - 1);
			list.add(next);
			i++;
		} while (next < n);

		if (n == 0) {
			System.out.println("0 0 0");
		} else if (n == 1) {
			System.out.println("0 0 1");
		} else if (n == 2) {
			System.out.println("0 1 1");
		} else {
			int index = Collections.binarySearch(list, n);
			System.out.println(list.get(index - 4) + " " + list.get(index - 3)
					+ " " + list.get(index - 1));
		}
	}
}
