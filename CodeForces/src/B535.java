import java.util.Scanner;

public class B535 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] n = in.next().toCharArray();
		int length = n.length;
		int pow = 1 << (length - 1);
		long index = 0;
		for (int i = 0; i < length; ++i) {
			if (n[i] == '7') {
				index += pow * 2;
			} else {
				index += pow;
			}
			pow = pow >> 1;
		}
		System.out.println(index);

	}
}
