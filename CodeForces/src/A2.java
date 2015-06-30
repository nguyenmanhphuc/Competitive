import java.util.Arrays;
import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		R rounds[] = new R[n];
		for (int i = 0; i < n; ++i) {
			rounds[i] = new R(in.next(), in.nextInt(), i + 1);
		}

		Arrays.sort(rounds);

		String currentName = "";
		String winner = "";
		int first = 0;
		int curF = 0;
		int curMax = 0;
		int temp = 0;
		int max = 0;
		int[] scores = new int[n];
		int start = 0;
		for (int i = 0; i < n; ++i) {
			if (currentName.equals(rounds[i].name)) {
				scores[i] = scores[i - 1] + rounds[i].score;
				temp = scores[i];
			} else {
				for (int j = start; j < i; ++j) {
					if (scores[j] >= temp) {
						curF = rounds[j].index;
						break;
					}
				}
				if (max < temp) {
					winner = currentName;
					first = curF;
					max = temp;
				} else if (max == temp && curF < first) {
					winner = currentName;
					first = curF;
				}
				start = i;
				scores[i] = rounds[i].score;
				temp = scores[i];
				currentName = rounds[i].name;
			}
		}
		for (int j = start; j < n; ++j) {
			if (scores[j] >= temp) {
				curF = rounds[j].index;
				break;
			}
		}

		if (max < temp) {
			winner = currentName;
		} else if (max == temp && curF < first) {
			winner = currentName;
		}
		System.out.println(winner);

	}
}

class R implements Comparable<R> {
	String name;
	int score;
	int index;

	public R(String name, int score, int index) {
		this.name = name;
		this.score = score;
		this.index = index;
	}

	@Override
	public int compareTo(R r) {
		int compare = name.compareTo(r.name);
		if (compare == 0) {
			return index - r.index;
		}
		return compare;
	}
}