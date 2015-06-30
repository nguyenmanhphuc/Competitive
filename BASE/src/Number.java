import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Number {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();
		while (t-- > 0) {
			String s = in.nextLine();
			List<String> list = new ArrayList<String>();
			int l = s.length();
			for (int i = 0; i < l; ++i) {
				for (int j = i + 1; j <= l; ++j) {
					char arr[] = s.substring(i, j).toCharArray();
					Arrays.sort(arr);
					list.add(new String(arr));
				}
			}

			Collections.sort(list);
			long count = 1;
			long size = list.size();
			String pre = list.get(0);
			long result = 0;
			for (int i = 1; i < size; ++i) {
				if (list.get(i).equals(pre)) {
					count++;
				} else {
					pre = list.get(i);
					result += count * (count - 1) / 2;
					count = 1;
				}
			}
			result += count * (count - 1) / 2;
			System.out.println(result);
		}
	}

	public static int[] enumLowestPrimeFactors(int n) {
		int tot = 0;
		int[] lowestPrimeFactors = new int[n + 1];

		int[] primes = new int[n + 1];
		for (int i = 2; i <= n; i++)
			lowestPrimeFactors[i] = i;
		for (int p = 2; p <= n; p++) {
			if (lowestPrimeFactors[p] == p)
				primes[tot++] = p;
			int tmp;
			for (int i = 0; i < tot && primes[i] <= lowestPrimeFactors[p]
					&& (tmp = primes[i] * p) <= n; i++) {
				lowestPrimeFactors[tmp] = primes[i];
			}
		}
		return lowestPrimeFactors;
	}

}