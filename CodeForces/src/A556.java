import java.util.Scanner;

public class A556 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		char[] n = in.next().toCharArray();
		int count1 = 0;
		for (int i = 0; i < n.length; ++i) {
			if (n[i] == '1') {
				count1++;
			}
		}
		System.out.println(Math.abs(n.length - 2 * count1));

	}

}
