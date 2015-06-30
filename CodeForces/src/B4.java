import java.util.Scanner;

public class B4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = in.nextInt();
		int minT[] = new int[n];
		int maxT[] = new int[n];
		int min = 0;
		int max = 0;
		for (int i = 0; i < n; ++i) {
			minT[i] = in.nextInt();
			maxT[i] = in.nextInt();
			min += minT[i];
			max += maxT[i];
		}

		if (sum < min || sum > max) {
			System.out.println("NO");
			return;
		}
		System.out.println("YES");
		int left = sum - min;
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			int diff = maxT[i] - minT[i];
			int take = minT[i] + Math.min(diff, left);
			left -= Math.min(diff, left);

			if (i > 0) {
				str.append(' ');
			}
			str.append(take);
		}
		System.out.println(str);
	}
}
