import java.util.Scanner;

public class C518 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		int pos[] = new int[n + 1];
		int value[] = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			int t = in.nextInt();
			pos[t] = i;
			value[i] = t;
		}

		long count = 0;
		for (int i = 0; i < m; ++i) {
			int id = in.nextInt();
			int index = pos[id];
			if (index == 1) {
				count++;
				continue;
			}
			int preValue = value[index - 1];
			pos[preValue] = index;
			pos[id] = index - 1;
			value[index] = preValue;
			value[index - 1] = id;
			count += (index + k - 1) / k ;
		}
		System.out.println(count);
	}

}
