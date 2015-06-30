import java.util.Scanner;

public class B284 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] pokers = in.next().toCharArray();
		int countIn = 0;
		int countFolded = 0;
		for (char c : pokers) {
			if (c == 'I') {
				countIn++;
			} else if (c == 'F') {
				countFolded++;
			}
		}

		if (countIn == 1) {
			System.out.println("1");
		} else if (countIn > 1) {
			System.out.println(0);
		} else {
			System.out.println(n - countFolded);
		}

	}

}
