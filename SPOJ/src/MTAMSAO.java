import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MTAMSAO {
	static long[] male ;
	static long[] female;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		male = new long[n + 1];
		female = new long[n + 1];
		List<Integer>[] query = new List[n + 1];
		query[0] = new ArrayList<>();
		int preMan = 0;
		int preWoman = 0;
		int manIndex = 0;
		int womanIndex = 0;
		int[] countMan = new int[n + 1];
		int values[] = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			int value = in.nextInt();
			query[i] = new ArrayList<>();
			values[i] = value;
			if (value < 0) {
				countMan[i] = countMan[i - 1];
				query[manIndex].add(-value);
				womanIndex = preWoman;
				preWoman = i;
			} else {
				countMan[i] = countMan[i - 1] + 1;
				query[womanIndex].add(value);
				manIndex = preMan;
				preMan = i;
			}
		}
		long a = 0;
		long b = 0;
		for (int i = 1; i <= n; ++i) {
			if (values[i] < 0) {
				for (Integer value : query[i]) {
					a += countMan[i] - sum(male, value);
				}
				add(female, -values[i], 1);
			} else {
			
				for (Integer value : query[i]) {
					b += sum(female, value);
				}
				add(male, values[i], 1);
			}
		}
		System.out.println(a + " " + b);
	}

	public static void add(long[] t, int i, int value) {
		for (; i < t.length; i |= i + 1)
			t[i] += value;
	}

	// sum[0..i]
	public static int sum(long[] t, int i) {
		int res = 0;
		for (; i >= 0; i = (i & (i + 1)) - 1)
			res += t[i];
		return res;
	}
}

class Query {
	int type;
	int value;

	public Query(int type, int value) {
		this.type = type;
		this.value = value;
	}
}