import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		int prices[] = new int[n];

		for (int i = 0; i < n; ++i) {
			prices[i] = in.nextInt();
		}

		String[] fruits = new String[m];
		in.nextLine();

		for (int i = 0; i < m; ++i) {
			fruits[i] = in.nextLine();
		}

		Arrays.sort(fruits);
		Arrays.sort(prices);

		long max = 0;
		long min = 0;
		int left = 0;
		int right = n - 1;

		String currentName = "";
		List<Integer> listIntegers = new ArrayList<Integer>();
		int count = 0;

		for (int i = 0; i < m; ++i) {
			if (currentName.equals(fruits[i])) {
				count++;
			} else {
				if (!currentName.equals("")) {
					listIntegers.add(count);
				}
				currentName = (fruits[i]);
				count = 1;
			}
		}
		listIntegers.add(count);
		Collections.sort(listIntegers);

		for (int i = listIntegers.size() - 1; i >= 0; --i) {
			min += listIntegers.get(i) * prices[left++];
			max += listIntegers.get(i) * prices[right--];
		}

		System.out.println(min + " " + max);

	}
}
