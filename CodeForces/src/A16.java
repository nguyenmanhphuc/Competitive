import java.util.Scanner;

public class A16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int pre = -1;
		in.nextLine();
		for (int i = 0; i < n; ++i) {
			char[] line = in.next().toCharArray();
			if (!checkSame(line) || line[0] == pre) {
				System.out.println("NO");
				return;
			}
			pre = line[0];
		}

		System.out.println("YES");

	}

	private static boolean checkSame(char[] line) {
		int length = line.length;
		for (int i = 1; i < length; ++i) {
			if (line[i] != line[0]) {
				return false;
			}
		}
		return true;
	}

}
