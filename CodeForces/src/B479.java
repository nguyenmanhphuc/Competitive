import java.util.Scanner;

public class B479 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		int[] a = new int[n];
		int k = in.nextInt();
		for (int i = 0; i < n; ++i) {
			a[i] = in.nextInt();
			sum += a[i];
		}

		int min = 0;
		int max = 0;
		StringBuilder str = new StringBuilder();
		int count = 0;
		int countMore = sum % n;
		int diff = -1;
		do {
			min = 0;
			max = 0;
			for (int i = 1; i < n; ++i) {
				if (a[i] < a[min]) {
					min = i;
				} else if (a[i] > a[max]) {
					max = i;
				}
			}
			if (a[max] - a[min] <= 1 || count == k) {
				diff = a[max] - a[min];
				break;
			} else {
				if (a[max] - a[min] < 2) {
					break;
				}
				str.append((max + 1) + " " + (min + 1));

				int move = ((a[max] + a[min]) >> 1) - a[min];
				a[max]--;
				a[min]++;
				str.append('\n');
				count++;
			}
		} while (true);
		System.out.println(diff + " " + count);
		System.out.print(str);
	}
}
