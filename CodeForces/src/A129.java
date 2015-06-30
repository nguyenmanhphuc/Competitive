import java.util.Scanner;

public class A129 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count[] = new int[2];
		int sum = 0;
		for (int i = 0; i < n; ++i) {
			int temp = in.nextInt();
			sum += temp;
			count[temp & 1]++;
		}

		if (sum % 2 == 0) {
			System.out.println(count[0]);
		} else {
			System.out.println(count[1]);
		}
	}
}
