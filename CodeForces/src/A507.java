import java.util.Arrays;
import java.util.Scanner;

public class A507 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();

		Instrument[] instruments = new Instrument[n];
		for (int i = 0; i < n; ++i) {
			instruments[i] = new Instrument(i + 1, in.nextInt());
		}

		Arrays.sort(instruments);

		int count = 0;
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			if (instruments[i].day > k) {
				break;
			} else {
				if (count > 0) {
					stringBuilder.append(' ');
				}
				stringBuilder.append(instruments[i].index);
				count++;
				k-=instruments[i].day;
			}
		}
		System.out.println(count);
		System.out.println(stringBuilder);

	}

}

class Instrument implements Comparable<Instrument> {
	int index;
	int day;

	public Instrument(int index, int day) {
		this.index = index;
		this.day = day;
	}

	@Override
	public int compareTo(Instrument a) {
		return day - a.day;
	}
}
