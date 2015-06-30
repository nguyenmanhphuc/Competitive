import java.util.Scanner;

public class TrainTracks11586 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; ++i) {
			solve();
		}

	}

	private static void solve() {

		char[] s = in.nextLine().toCharArray();
		int[][] arr = new int[2][300];
		int l = s.length;
		int c = 0;
		for (int i = 0; i < l; ++i) {
			if (s[i] == 'M' || s[i] == 'F') {
				c++;
				arr[c & 1][s[i]]++;
			}
		}
		if (arr[0]['M'] == arr[1]['F'] && arr[1]['M'] == arr[0]['F'] && c > 2) {
			System.out.println("LOOP");
		} else {
			System.out.println("NO LOOP");
		}
	}
}
