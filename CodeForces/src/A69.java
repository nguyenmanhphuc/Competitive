import java.util.Scanner;

public class A69 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long sumX = 0;
		long sumY = 0;
		long sumZ = 0;
		for (int i = 0; i < n; ++i) {
			sumX += in.nextLong();
			sumY += in.nextLong();
			sumZ += in.nextLong();
		}
		System.out
				.println((sumX == 0 && sumY == 0 && sumZ == 0) ? "YES" : "NO");
	}

}
