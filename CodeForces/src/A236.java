import java.util.Scanner;

public class A236 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] name = in.next().toCharArray();

		boolean exists[] = new boolean[300];
		for (int i = 0; i < name.length; ++i) {
			exists[name[i]] = true;
		}

		int count = 0;

		for (int i = 'a'; i <= 'z'; ++i) {
			if (exists[i]) {
				count++;
			}
		}

		System.out.println(count % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");

	}

}
