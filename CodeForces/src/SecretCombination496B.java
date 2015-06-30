import java.util.Scanner;

public class SecretCombination496B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char arr[] = new char[n];

		arr = in.next().toCharArray();
		int digits[] = new int[n];
		for (int i = 0; i < n; ++i) {
			digits[i] = Integer.parseInt(arr[i] + "");
		}
		String result = new String(arr);
		for (int i = 0; i < n; ++i) {
			StringBuilder str = new StringBuilder();
			int add = 10 - arr[i];
			for (int j = 0; j < n; ++j) {
				str.append((arr[(i + j) % n] + add) % 10);
			}
			String current = str.toString();
			if (current.compareTo(result) < 0) {
				result = current;
			}
		}
		System.out.println(result);

	}
}
