import java.util.Scanner;

public class B12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int arr[] = new int[11];
		int min = 10;

		while (n > 0) {
			int temp = n % 10;
			n /= 10;
			if (temp > 0 && temp < min) {
				min = temp;
			}
			arr[temp]++;
		}

		long result = min == 10 ? 0 : min;
		arr[min]--;
		for (int i = 0; i < 10; ++i) {
			for (int j = 0; j < arr[i]; ++j) {
				result *= 10;
				result += i;
			}
		}
		System.out.println(in.next().equals(result+"") ? "OK" : "WRONG_ANSWER");

	}
}
