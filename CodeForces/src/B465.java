import java.util.Scanner;

public class B465 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean inViewMode = false;
		int pre = in.nextInt();
		int result = 0;
		if (pre == 1) {
			result = 1;
			inViewMode = true;
		}
		for (int i = 1; i < n; ++i) {
			int current = in.nextInt();
			if (current == 1) {
				result++;
				if (!inViewMode) {
					inViewMode = true;
				}
			} else {
				if (inViewMode) {
					inViewMode = false;
					result++;
				}
			}
		}
		if (!inViewMode && result > 0) {
			result--;
		}
		System.out.println(result);
	}

}
