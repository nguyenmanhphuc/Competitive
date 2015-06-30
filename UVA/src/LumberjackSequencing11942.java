import java.util.Scanner;

public class LumberjackSequencing11942 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("Lumberjacks:");
		for (int i = 0; i < n; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			boolean isOrdered = true;
			int pre = b - a;
			a = b;
			for (int j = 2; j < 10; ++j) {
				b = in.nextInt();
				if (isOrdered && (b - a) * pre < 0) {
					isOrdered = false;
				}
				a = b;
			}
			System.out.println(isOrdered ? "Ordered" : "Unordered");
		}

	}

}
