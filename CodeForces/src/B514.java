import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class B514 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		D[] ds = new D[n];
		int x = in.nextInt();
		int y = in.nextInt();
		for (int i = 0; i < n; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			ds[i] = new D(a, b);
		}
		boolean died[] = new boolean[n];
		for (int i = 0; i < n; ++i) {
			if (!died[i]) {
				count++;
				int a = x - ds[i].a;
				int b = y - ds[i].b;
				died[i] = true;
				for (int j = i + 1; j < n; ++j) {
					int c = x - ds[j].a;
					int d = y - ds[j].b;
					if (a * d == b * c) {
						died[j] = true;
					}
				}
			}
		}
		System.out.println(count);

	}

	static int gcd(int a, int b) {
		if (a == 0 && b == 0) {
			return 0;
		}
		if (b == 0 || a == 0) {
			return Math.max(a, b);
		}

		return a % b == 0 ? b : gcd(b, a % b);
	}

}

class D implements Comparable<D> {
	int a;
	int b;

	public D(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int compareTo(D d) {
		if (this.a != d.a) {
			return Integer.compare(this.a, d.a);
		}
		return Integer.compare(this.b, d.b);
	}
}