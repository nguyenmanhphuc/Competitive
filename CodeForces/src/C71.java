import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C71 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> goods = new ArrayList<>();
		for (int i = 0; i < n; ++i) {
			if (in.nextInt() == 1) {
				goods.add(i);
			}
		}

		List<Integer> factors = new ArrayList<>();
		for (int i = 3; i * i <= n; ++i) {
			if (n % i != 0) {
				continue;
			}

			int a = n / i;
			if (a != i) {
				factors.add(a);
			}
			factors.add(i);
		}

		if (n % 2 == 0 && n / 2 >=3) {
			factors.add(2);
		}
		factors.add(1);

		int length = factors.size();
		int[][] count = new int[length][];
		for (int i = 0; i < length; ++i) {
			count[i] = new int[factors.get(i)];
		}

		for (int i : goods) {
			for (int j = 0; j < length; ++j) {
				int f = factors.get(j);
		
				int mod = i % f;
				count[j][mod]++;
				if (count[j][mod] * f == n) {
					System.out.println("YES");
					return;
				}
			}
		}
		System.out.println("NO");
	}

}
