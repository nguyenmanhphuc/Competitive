import java.util.Scanner;

public class HajjeAkbar12577 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		int cas = 1;
		while (!(s = in.next()).equals("*")) {
			System.out.print("Case " + cas++ + ": ");
			if (s.equals("Hajj")) {
				System.out.println("Hajj-e-Akbar");
			} else {
				System.out.println("Hajj-e-Asghar");
			}
		}

	}
}
