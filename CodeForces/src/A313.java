import java.util.Scanner;

public class A313 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int abs = Math.abs(n);
		int i = n < 0 ? -1 : 1;
		int a = (abs / 100 * 10 + abs % 10) * i;
		int b = (abs / 10) * i;
		int max = Math.max(a, b);
		max = Math.max(max, n);
		System.out.println(max);

	}
}
