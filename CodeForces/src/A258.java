import java.util.Scanner;

public class A258 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int index = s.indexOf('0');
		if (index == -1) {
			System.out.println(s.substring(1));
		} else {
			System.out.println(s.substring(0, index) + s.substring(index + 1));
		}

	}

}
