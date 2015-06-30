import java.util.Scanner;

public class A312 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();

		for (int i = 0; i < n; ++i) {
			String s = in.nextLine();
			int length = s.length();
			if (length < 5) {
				System.out.println("OMG>.< I don't know!");
				continue;
			}

			String begin = s.substring(0, 5);
			boolean b = begin.equals("miao.");
			String last = s.substring(length - 5);
			boolean l = last.equals("lala.");
			String r = "";
			if ((b && l) || !(b || l)) {
				System.out.println("OMG>.< I don't know!");
			} else if (l) {
				System.out.println("Freda's");
			} else if (b) {
				System.out.println("Rainbow's");
			} else {

			}
		}

	}

}
