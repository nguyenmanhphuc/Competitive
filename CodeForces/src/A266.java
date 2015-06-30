import java.util.Scanner;

public class A266 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] stones = in.next().toCharArray();
		int countPickedStones = 0;
		for (int i = 1; i < n; ++i) {
			if (stones[i] == stones[i - 1]) {
				countPickedStones++;
			}
		}
		System.out.println(countPickedStones);

	}

}
