import java.util.Scanner;

public class B476 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char original[] = in.next().toCharArray();
		int length = original.length;
		int countPos = 0;
		int countNeg = 0;
		for (int i = 0; i < length; ++i) {
			if (original[i] == '+') {
				countPos++;
			} else {
				countNeg++;
			}
		}

		char received[] = in.next().toCharArray();
		int countRecPos = 0;
		int countRecNeg = 0;

		for (int i = 0; i < length; ++i) {
			if (received[i] == '+') {
				countRecPos++;
			} else if (received[i] == '-') {
				countRecNeg++;
			}
		}

		int countQuestion = length - countRecNeg - countRecPos;
		double C = 1;
		int k = countPos - countRecPos;
		if (k < 0) {
			System.out.println(0);
			return;
		}
		int j = 1;
		for (int i = countQuestion - k + 1; i <= countQuestion; ++i) {
			C = C * i / j++;
		}

		for (int i = 0; i < countQuestion; ++i) {
			C /= 2;
		}

		System.out.println(C);
	}
}
