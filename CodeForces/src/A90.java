import java.util.Scanner;

public class A90 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();

		int m1 = ((r + 1) / 2 - 1) * 3 + 30;
		int m2 = ((g + 1) / 2 - 1) * 3 + 31;
		int m3 = ((b + 1) / 2 - 1) * 3 + 32;
		System.out.println(Math.max(m1, Math.max(m2, m3)));

	}

}
