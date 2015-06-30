import java.util.Scanner;

public class A26 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int countPrimeDivisors[] = new int[n + 1];

		int result = 0;
		for (int i = 2; i <= n; ++i) {
			if (countPrimeDivisors[i] == 0) {
				for (int j = i << 1; j <= n; j += i) {
					countPrimeDivisors[j]++;
				}
			} else if (countPrimeDivisors[i] == 2) {
				result++;
			}
		}
		System.out.println(result);

	}
}
