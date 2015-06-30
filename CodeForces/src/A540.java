import java.util.Scanner;

public class A540 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		char[] original = in.next().toCharArray();
		char[] combination = in.next().toCharArray();
		for (int i = 0; i < n; ++i) {
			int c = Math.abs(original[i] - combination[i]);
			count += Math.min(c, 10 - c);
		}
		System.out.println(count);

	}
}
