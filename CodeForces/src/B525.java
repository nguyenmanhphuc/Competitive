import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B525 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		int length = s.length;

		int n = in.nextInt();
		int arr[] = new int[length + 1];
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; ++i) {
			int temp = in.nextInt();
			int other = length - temp + 1;
			int min = Math.min(temp - 1, other - 1);
			arr[min]++;
			if (arr[min] == 1) {
				list.add(min);
			}
		}


		Collections.sort(list);
		int count = 0;
		int size = list.size();
		for (int i = 0; i < size; ++i) {
			int c = list.get(i);
			count += arr[c];
			if ((count & 1) == 1) {
				int start = c;
				int end = i < size - 1 ? list.get(i + 1) : length / 2;

				for (int k = c; k < end; ++k) {
					int l = length - 1 - k;
					char t = s[k];
					s[k] = s[l];
					s[l] = t;
				}
			}
		}
		System.out.println(new String(s));

	}
}
