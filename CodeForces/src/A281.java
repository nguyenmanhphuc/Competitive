import java.util.Scanner;

public class A281 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		if (s[0] >= 'a') {
			s[0] = (char) (s[0] + 'A' - 'a');
		}
		System.out.println(new String(s));
	}

}
