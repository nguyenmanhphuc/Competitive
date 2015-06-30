import java.util.Scanner;

public class C520 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] s = in.next().toCharArray();

		int[] counts = new int[300];
		for (int i = 0; i < n; ++i) {
			counts[s[i]]++;
		}

		int max = 0;
		int countMax = 0;
		for (int i = 'A'; i <= 'T'; ++i) {
			if (counts[i] > max) {
				countMax = 1;
				max = counts[i];
			} else if (counts[i] == max) {
				countMax++;
			}
		}
		long result = 1;
		int mod = (int) (1e9 + 7);
		for (int i = 0; i < n; ++i) {
			result *= countMax;
			result %= mod;
		}
		
		System.out.println(result);
	}
}
