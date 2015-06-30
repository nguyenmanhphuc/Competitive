import java.util.Scanner;

public class B467 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();

		long[] players = new long[m + 1];
		for (int i = 0; i <= m; ++i) {
			players[i] = in.nextLong();
		}

		int countFriends = 0;

		for (int i = 0; i < m; ++i) {
			int countDiff = 0;
			for (int j = 0; j < n; ++j) {
				long bit = players[i] & (1 << j);

				long bitP = players[m] & (1 << j);
				if (bit != bitP) {
					countDiff++;
				}
			}
			if(countDiff<=k){
				countFriends++;
			}
		}
		System.out.println(countFriends);

	}

}
