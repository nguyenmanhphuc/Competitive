import java.util.Scanner;

public class BASEH {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int h = in.nextInt();
		StringBuilder str = new StringBuilder();
		while (k > 0) {
			if ((k & 1) == 0) {
				str.append("0");
			} else {
				str.append("1");
			}
			k /= 2;
		}
		System.out.println(str.reverse());
	}
}
