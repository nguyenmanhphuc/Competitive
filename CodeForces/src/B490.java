import java.util.Arrays;
import java.util.Scanner;

public class B490 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int pre[] = new int[1000001];
		int after[] = new int[1000001];
		Arrays.fill(pre, -1);
		Arrays.fill(after, -1);
		for (int i = 0; i < n; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			pre[b] = a;
			after[a] = b;
		}

		int theSecond = after[0];
		int theFirst = -1;
		for (int i = 1; i <= 1000000; ++i) {
			if (pre[i] == -1 && after[i] >= 0) {
				theFirst = i;
				break;
			}
		}
		int cur = 0;
		int queue[] = new int[n];
		int next = theFirst;
		while (cur < n) {
			queue[cur] = next;
			next = after[next];
			cur+=2;
		}
		cur = 1;
		next = theSecond;
		while (cur < n) {
			queue[cur] = next;
			
			next = after[next];
			cur+=2;
		}
		System.out.print(queue[0]);
		for (int i = 1; i < n; ++i) {
			System.out.print(" " + queue[i]);
		}

	}
}
