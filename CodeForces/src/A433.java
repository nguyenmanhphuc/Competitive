import java.util.Scanner;

public class A433 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count100 = 0;
		int count200 = 0;
		for (int i = 0; i < n; ++i) {
			int weight = in.nextInt();
			if (weight == 100) {
				count100++;
			} else {
				count200++;
			}
		}
		String result = "";
		if (count200 % 2 == 1) {
			if (count100 < 2 || (count100 - 2) % 2 != 0) {
				result = "NO";
			} else {
				result = "YES";
			}
		} else {
			result = count100 % 2 == 0 ? "YES" : "NO";
		}

		System.out.println(result);

	}

}
