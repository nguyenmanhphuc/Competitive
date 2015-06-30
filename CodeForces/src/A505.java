import java.util.Scanner;

public class A505 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		int l = s.length;

		int i = 0;
		int j = l - 1;
		while (i < j) {
			if (s[i] == s[j]) {
				i++;
				j--;
				continue;
			}

			StringBuilder str = new StringBuilder();
			for (int k = 0; k < i; ++k) {
				str.append(s[k]);
			}
			str.append(s[j]);

			for (int k = i; k < l; ++k) {
				str.append(s[k]);
			}

			if (str.toString().equals(str.reverse().toString())) {
				System.out.println(str);
				return;
			}

			str = new StringBuilder();

			for (int k = 0; k <= j; ++k) {
				str.append(s[k]);
			}
			str.append(s[i]);

			for (int k = j + 1; k < l; ++k) {
				str.append(s[k]);
			}

			if (str.toString().equals(str.reverse().toString())) {
				System.out.println(str);
				return;
			}

			System.out.println("NA");
			return;
		}

		StringBuilder str = new StringBuilder();

		int mid = (l - 1) >> 1;

		for ( i = 0; i <= mid; ++i) {
			str.append(s[i]);
		}
		str.append(s[mid]);
		

		for ( i = mid+1; i < l; ++i) {
			str.append(s[i]);
		}
		System.out.println(str);
	}
}
