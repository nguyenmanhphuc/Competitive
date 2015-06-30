import java.util.Scanner;

import javax.swing.plaf.SliderUI;

public class A141 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] count = new int[300];
		char[] s = in.next().toCharArray();
		for (int i = 0; i < s.length; ++i) {
			count[s[i]]++;
		}

		s = in.next().toCharArray();
		for (int i = 0; i < s.length; ++i) {
			count[s[i]]++;
		}

		s = in.next().toCharArray();
		for (int i = 0; i < s.length; ++i) {
			count[s[i]]--;
		}

		for (int i = 'A'; i <= 'Z'; ++i) {
			if (count[i] != 0) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

	}

}
