import java.util.Scanner;

//Not yet
public class TheSwallowingGround10963 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int numberTestCase = in.nextInt();
		for (int i = 0; i < numberTestCase; ++i) {
			if (i != 0) {
				System.out.println();
			}
			solve();
		}

	}

	private static void solve() {
		int numberCols = in.nextInt();
		boolean check = true;

		int gap = in.nextInt() - in.nextInt();
		for (int i = 1; i < numberCols; ++i) {
			if (gap != in.nextInt() - in.nextInt()) {
				check = false;
			}
		}
		if (check) {
			System.out.println("yes");
		}else{
			System.out.println("no");
		}

	}
}
