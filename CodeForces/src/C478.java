import java.util.Scanner;

public class C478 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextInt();
		long b = in.nextInt();
		long c = in.nextInt();
		long max = Math.max(a, b);
		max = Math.max(max, c);
		long sum = a + b + c;
		long left = sum - max;
		if (left *2< max) {
			System.out.println(left);
		} else {
			System.out.println(sum / 3);
		}
	}

}
