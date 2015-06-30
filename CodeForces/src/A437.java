import java.util.Arrays;
import java.util.Scanner;

public class A437 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		AN[] answ = new AN[4];
		for (int i = 0; i < 4; ++i) {
			answ[i] = new AN((char) ('A' + i), in.next().length() - 2);
		}
		Arrays.sort(answ);
		if (answ[0].value * 2 <= answ[1].value) {
			if (answ[2].value * 2 <= answ[3].value) {
				System.out.println("C");
				return;
			}

			System.out.println(answ[0].index);
		} else if (answ[2].value * 2 <= answ[3].value) {
			System.out.println(answ[3].index);
		} else {
			System.out.println("C");
		}
	}
}

class AN implements Comparable<AN> {
	char index;
	int value;

	public AN(char index, int value) {
		this.index = index;
		this.value = value;
	}

	@Override
	public int compareTo(AN a) {
		return this.value - a.value;
	}
}
