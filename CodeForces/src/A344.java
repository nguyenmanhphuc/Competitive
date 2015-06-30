import java.util.Scanner;

public class A344 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int count = 1;
		for (int i = 1; i < n; ++i) {
			String next = in.next();
			if (next .equals(s)) {
				continue;
			}
			count++;
			s = next;
		}
		System.out.println(count);

	}

}
