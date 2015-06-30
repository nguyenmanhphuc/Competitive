import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B493 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> first = new ArrayList<>();
		List<Integer> second = new ArrayList<>();
		long totalFirst = 0;
		long totalSecond = 0;
		int last = -1;
		for (int i = 0; i < n; ++i) {
			int value = in.nextInt();
			if (value > 0) {
				first.add(value);
				totalFirst += value;
			} else {
				second.add(-value);
				totalSecond += -value;
			}
			if (i == n - 1) {
				last = value;
			}
		}

		if (totalFirst > totalSecond) {
			System.out.println("first");
			return;
		} else if (totalFirst < totalSecond) {
			System.out.println("second");
			return;
		}


		int min = Math.min(first.size(), second.size());
		for (int i = 0; i < min; ++i) {
			if (first.get(i) != second.get(i)) {
				System.out.println(first.get(i) > second.get(i) ? "first"
						: "second");
				return;
			}
		}
		if (first.size() > second.size()) {
			System.out.println("first");
			return;
		} else if (first.size() < second.size()) {
			System.out.println("second");
			return;
		}

		System.out.println(last > 0 ? "first" : "second");
	}
}
