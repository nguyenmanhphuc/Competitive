import java.util.Scanner;

public class A378 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		int firstWin = 0;
		int secondWin = 0;
		int draw = 0;

		for (int i = 1; i <= 6; ++i) {
			int disA = Math.abs(i - a);
			int disB = Math.abs(i - b);
			if (disA > disB) {
				secondWin++;
			} else if (disA < disB) {
				firstWin++;
			} else {
				draw++;
			}
		}

		System.out.println(firstWin + " " + draw + " " + secondWin);

	}
}
