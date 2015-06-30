import java.util.Scanner;

public class A500 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int arr[] = new int[n + 1];
		for (int i = 1; i < n ; ++i) {
			arr[i] = in.nextInt();
		}
		boolean visited[] = new boolean[n + 1];
		int cur = 1;
		// visited[cur] =true;
		while (!visited[cur]) {
			if (cur == t) {
				System.out.println("YES");
				return;
			}
			visited[cur] = true;
			cur = cur + arr[cur];

		}
		System.out.println("NO");
	}

}
