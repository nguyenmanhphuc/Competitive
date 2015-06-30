import java.util.Scanner;

public class B435 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] n = in.next().toCharArray();
		int k = in.nextInt();
		int length = n.length;
		int index = 0;
		while (k > 0 && index < length) {
			int iMax = index;
			for (int i = index; i < length && i <= index + k; ++i) {
				if (n[iMax] < n[i]) {
					iMax = i;
				}
			}
			k -= (iMax - index);

			for (int i = iMax; i > index; --i) {
				char t = n[i];
				n[i] = n[i - 1];
				n[i - 1] = t;
			}
			index++;
		}
		System.out.println(new String(n));

	}
}
