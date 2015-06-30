import java.util.Scanner;

public class B285 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = in.nextInt();
		int t = in.nextInt();
		int glasses[] = new int[n + 1];
		boolean visited[] = new boolean[n + 1];
		int cur = s;
		for (int i = 1; i <= n; ++i) {
			glasses[i] = in.nextInt();
		}
	
		int count = 0;
		while (cur != t) {
			visited[cur] = true;
			cur = glasses[cur];
			count++;
			if (visited[cur]) {

				System.out.println(-1);

				return;
			}
		}
		System.out.println(count);
	}
}
