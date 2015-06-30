import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		List<Integer> costEarns = new ArrayList<>();
		for (int i = 0; i < n; ++i) {
			int cost = in.nextInt();
			if (cost < 0) {
				costEarns.add(cost);
			}
		}
		int total = 0;
		Collections.sort(costEarns);
		int size = costEarns.size();
		for (int i = 0; i < size && i < m; ++i) {
			total -= costEarns.get(i);
		}
		System.out.println(total);
	}

}
