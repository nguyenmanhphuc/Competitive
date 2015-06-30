import java.util.Arrays;
import java.util.Scanner;

public class B519 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int first[] = new int[n];
		for (int i = 0; i < n; ++i) {
			first[i] = in.nextInt();
		}
		Arrays.sort(first);

		int second[] = new int[n - 1];
		int newLength = n - 1;
		for (int i = 0; i < newLength; ++i) {
			second[i] = in.nextInt();
		}
		Arrays.sort(second);

		int third[] = new int[n - 2];
		int newestLength = n - 2;

		for (int i = 0; i < newestLength; ++i) {
			third[i] = in.nextInt();
		}
		Arrays.sort(third);

		System.out.println(findDiffer(first, second));
		System.out.println(findDiffer(second, third));
	}

	private static int findDiffer(int[] first, int[] second) {
		int length = second.length;
		for (int i = 0; i < length; ++i) {
			if (first[i] != second[i]) {
				return first[i];
			}
		}
		return first[length];
	}

}
