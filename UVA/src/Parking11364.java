import java.util.Scanner;

public class Parking11364 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int cas = 1; cas <= t; ++cas) {
			int n = in.nextInt();
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < n; ++i) {
				int temp = in.nextInt();
				min = Math.min(min, temp);
				max = Math.max(max, temp);
			}
			System.out.println((max - min) << 1);
		}
		
		
	}

}
