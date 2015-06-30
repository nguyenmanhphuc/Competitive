import java.util.Scanner;

public class B538 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] n = in.next().toCharArray();
		int length = n.length;
		int max = 0;
		for (char c : n) {
			max = Math.max(max, c - '0');
		}
		System.out.println(max);
		String number = "";
		char[][] result = new char[max][length];
		for (int i = 0; i < length; ++i) {
			for (int j = 0; j < max; ++j) {
				result[j][i] = j < (n[i] - '0') ? ('1') : ('0');
			}
		}
		System.out.print(Integer.parseInt(new String(result[0])));
		for (int i = 1; i < max; ++i) {
			System.out.print(" " + Integer.parseInt(new String(result[i])));
		}
		System.out.println();
	}

}
