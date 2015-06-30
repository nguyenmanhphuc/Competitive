import java.util.Scanner;

public class A255 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] names = new String[] { "chest", "biceps", "back" };
		int[] count = new int[3];
		for (int i = 0; i < n; ++i) {
			count[i % 3] += in.nextInt();
		}

		if (count[0] > count[1] && count[0] > count[2]) {
			System.out.println(names[0]);
		} else if (count[1] > count[0] && count[1] > count[2]) {
			System.out.println(names[1]);
		} else {
			System.out.println(names[2]);
		}
	}

}
