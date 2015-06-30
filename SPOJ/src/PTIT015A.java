import java.util.Iterator;
import java.util.Scanner;

public class PTIT015A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numberTestCase = in.nextInt();
		while (numberTestCase-- > 0) {
			int sumLength = 0;
			int[] countDigits = new int[300];
			for (int k = 0; k < 3; ++k) {
				char[] a = in.next().toCharArray();
				sumLength += a.length;

				for (char d : a) {
					countDigits[d]++;
				}
			}

			char[] result = new char[sumLength];
			int index = 0;
			for (int i = '9'; i >= '0'; --i) {
				while (countDigits[i]-- > 0) {
					result[index++] = (char) (i);
				}
			}
			System.out.println(new String(result));
		}

	}
}
