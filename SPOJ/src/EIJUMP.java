import java.util.Arrays;
import java.util.Scanner;

public class EIJUMP {
	public static final int MAX = 200000;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] minJumpsForLastSameColorStones = new int[MAX + 1];
		Arrays.fill(minJumpsForLastSameColorStones, -1);
		int pre = 0;
		minJumpsForLastSameColorStones[in.nextInt()] = 0;
		for (int i = 1; i < n; ++i) {
			int color = in.nextInt();
			int cur = pre + 1;
			if (minJumpsForLastSameColorStones[color] >= 0) {
				cur = Math.min(cur, minJumpsForLastSameColorStones[color] + 1);
			}
			minJumpsForLastSameColorStones[color] = cur;
			pre = cur;
		}
		System.out.println(pre);
	}
}
