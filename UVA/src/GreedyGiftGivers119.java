import java.util.Arrays;
import java.util.Scanner;

public class GreedyGiftGivers119 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean check = false;
		while (in.hasNext()) {
			if (check) {
				System.out.println();
			}
			check = true;
			int n = in.nextInt();
			String[] names = new String[n];
			String[] result = new String[n];
			for (int i = 0; i < n; ++i) {
				names[i] = in.next();
				result[i] = new String(names[i]);
			}
			Arrays.sort(names);
			int money[] = new int[n];
			for (int i = 0; i < n; ++i) {
				String name = in.next();
				int moneyGifts = in.nextInt();
				int numberOfGift = in.nextInt();
				if (numberOfGift == 0) {
					continue;
				}
				int moneyPerGif = moneyGifts / numberOfGift;
				int index = Arrays.binarySearch(names, name);
				money[index] -= numberOfGift * moneyPerGif;
				for (int j = 0; j < numberOfGift; ++j) {
					String receiver = in.next();
					index = Arrays.binarySearch(names, receiver);
					money[index] += moneyPerGif;
				}
			}
			for (int i = 0; i < n; ++i) {
				int index = Arrays.binarySearch(names, result[i]);
				System.out.println(result[i] + " " + money[index]);
			}
		}

	}
}
