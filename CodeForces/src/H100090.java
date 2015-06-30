import java.util.Scanner;

public class H100090 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int max = -1;
		for (int i = 0; i < n; ++i) {
			max = Math.max(max, in.nextInt());
		}
		max += 1;
		for (int i = 1; i < 32; ++i) {
			if (max == (1 << i)) {
				System.out.println("Mike");
				return;
			} 
		}
		System.out.println("Constantine");
	}

}
