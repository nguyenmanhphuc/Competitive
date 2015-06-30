import java.util.Arrays;
import java.util.Scanner;

public class P132SUMJ {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();

		int length = s.length;

		int[] z = new int[300];

		for (int i = length - 1; i >= 0; --i) {

			for (int k = s[i] + 1; k <= '9'; ++k) {
				if (z[k] > 0) {
					z[s[i]]++ ;
					s[i] = (char) k;
					int index = i + 1;
					z[k]--;
					for (int j = '0'; j <= '9'; ++j) {
						for (int l = 0; l < z[j]; ++l) {
							s[index++] = (char)j;
						}
					}
					System.out.println(new String(s));
					return;
				}
			}
			z[s[i]]++ ;
		}
		System.out.println(0);

	}
}
