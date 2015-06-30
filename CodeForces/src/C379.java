import java.util.Arrays;
import java.util.Scanner;

public class C379 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int value[] = new int[n];
		Rating[] ratings = new Rating[n];
		for (int i = 0; i < n; ++i) {
			ratings[i] = new Rating(i, in.nextInt());
		}

		Arrays.sort(ratings);
		int current = 1;
		for (Rating rating : ratings) {
			if (rating.value < current) {
				value[rating.index] = current;
			} else {
				value[rating.index] = rating.value;
				current = rating.value;
			}
			current++;
		}
		StringBuilder str = new StringBuilder();
		str.append(value[0]);
		for (int i = 1; i < n; ++i) {
			str.append(' ');
			str.append(value[i]);
		}
		System.out.println(str);
	}

}

class Rating implements Comparable<Rating> {
	int index;
	int value;

	public Rating(int index, int value) {
		super();
		this.index = index;
		this.value = value;
	}

	@Override
	public int compareTo(Rating r) {
		return Integer.compare(this.value, r.value);
	}
}