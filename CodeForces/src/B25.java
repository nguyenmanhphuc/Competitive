import java.util.Scanner;

public class B25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] next = in.next().toCharArray();
		StringBuilder str = new StringBuilder();
		int index = 0;
		if ((n & 1) == 0) {
			str.append(next[index++]);
			str.append(next[index++]);
		} else {
			str.append(next[index++]);
			str.append(next[index++]);
			str.append(next[index++]);
		}
		for (; index < n;) {
			str.append('-');
			str.append(next[index++]);
			str.append(next[index++]);
		}
		System.out.println(str);

	}
}
