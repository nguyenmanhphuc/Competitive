import java.util.Scanner;

public class A205 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int result = -1;
		int min = Integer.MAX_VALUE;
		int n = in.nextInt();
		for (int i = 1; i <= n; ++i) {
			int time = in.nextInt();
			if (time < min) {
				min = time;
				result = i;
			} else if (time == min) {
				result = -1;
			}
		}
		System.out.println(result == -1 ? "Still Rozdil" : result);
	}

}
