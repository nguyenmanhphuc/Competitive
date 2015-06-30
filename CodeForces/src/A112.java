import java.util.Scanner;

public class A112 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next().toLowerCase();
		String t = in.next().toLowerCase();
		int a = s.compareTo(t);

		System.out.println(a == 0 ? a : (a < 0 ? -1 : 1));

	}

}
