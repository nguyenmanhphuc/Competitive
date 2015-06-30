import java.util.Scanner;

public class B100187 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] str = in.next().toCharArray();
		long count[] = new long['z' + 1];
		for (int i : str) {
			count[i]++;
		}

		long result = 0;
		for (int i = 'a'; i <= 'z'; ++i) {
			result += count[i] * count[i];
		}

		System.out.println((double) result / str.length);
	}
}
