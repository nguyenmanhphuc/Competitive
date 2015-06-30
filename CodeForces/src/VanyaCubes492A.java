import java.util.Scanner;

public class VanyaCubes492A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n + 1];
		int result = 0;
		int preSize = 0;
		for (int i = 1; true; ++i) {

			preSize += i;
			if (preSize > n) {
				System.out.println(result);
				return;
			} else {
				result++;
				n -= preSize;
			}

		}
	}

}
