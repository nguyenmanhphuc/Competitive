import java.util.Scanner;

public class A43 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String name1 = in.next();
		int countTeam1 = 1;
		String teamTwo = "";
		for (int i = 1; i < n; ++i) {
			String name = in.next();
			if (name.equals(name1)) {
				countTeam1++;
			} else {
				teamTwo = name;
			}
		}

		System.out.println((countTeam1 << 1) > n ? name1 : teamTwo);

	}
}
