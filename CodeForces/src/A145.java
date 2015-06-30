import java.util.Scanner;

public class A145 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] a = in.nextLine().toCharArray();
		char[] b = in.nextLine().toCharArray();
		int count74 = 0;
		int count47 = 0;
		int length = a.length;
		for (int i = 0; i < length; ++i) {
			if (a[i] != b[i]) {
				if (a[i] == '7') {
					count74++;
				} else {
					count47++;
				}
			}
		}
		System.out.println(Math.max(count47, count74));
	}
}
