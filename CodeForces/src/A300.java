import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A300 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> negative = new ArrayList<Integer>();
		List<Integer> positive = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i) {
			int temp = in.nextInt();
			if (temp < 0) {
				negative.add(temp);
			} else if (temp > 0) {
				positive.add(temp);
			}

		}

		System.out.println(1 + " " + negative.get(0));
		int size1 = negative.size();
		int size2 = positive.size();
		StringBuilder str = new StringBuilder();
		boolean even = (size1 & 1) == 0;
		int total = size1 + size2 - 1;
		str.append(total  - (even ? 1 : 0));

		for (int i = 1; i < (even ? size1 - 1 : size1); ++i) {
			str.append(' ');
			str.append(negative.get(i));
		}

		for (int i = 0; i < size2; ++i) {
			str.append(' ');
			str.append(positive.get(i));
		}

		System.out.println(str);

		str = new StringBuilder();
		int size3 = n - total - 1;
		str.append(n - total - (even ? 0 : 1));

		for (int i = 0; i < size3; ++i) {
			str.append(" 0");

		}
		str.append(even ? " " + negative.get(size1 - 1) : "");
		System.out.println(str);
	}
}
