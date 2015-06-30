import java.util.Scanner;

public class A381 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] cards = new int[n];
		for (int i = 0; i < n; ++i) {
			cards[i] = in.nextInt();
		}

		int left = 0;
		int right = n - 1;
		int sumFirst = 0;
		int sumSecond = 0;
		for (int i = 0; i < n; ++i) {
			if ((i & 1) == 0) {
				sumFirst += cards[left] < cards[right] ? cards[right--]
						: cards[left++];
			} else {
				sumSecond += cards[left] < cards[right] ? cards[right--]
						: cards[left++];
			}
		}
		System.out.println(sumFirst + " " + sumSecond);

	}

}
