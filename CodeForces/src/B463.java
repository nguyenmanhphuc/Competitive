import java.util.Scanner;

public class B463 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int cur = 0;
		int cost = 0;
		int energy = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; ++i) {
			int height = in.nextInt();

			energy += cur - height;
			min = Math.min(min, energy);
			cur = height;
		}
		System.out.println(min >= 0 ? 0 : -min);

	}

}
