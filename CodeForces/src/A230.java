import java.util.Arrays;
import java.util.Scanner;

public class A230 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		Dragon[] dragons = new Dragon[n];
		for (int i = 0; i < n; ++i) {
			dragons[i] = new Dragon(in.nextInt(), in.nextInt());
		}

		Arrays.sort(dragons);

		for (int i = 0; i < n; ++i) {
			if (s <= dragons[i].x) {
				System.out.println("NO");
				return;
			} else {
				s += dragons[i].y;
			}
		}
		System.out.println("YES");
	}
}

class Dragon implements Comparable<Dragon> {
	int x;
	int y;

	public Dragon(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Dragon d) {
		return Integer.compare(this.x, d.x);
	}
}
