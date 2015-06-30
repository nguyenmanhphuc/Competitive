import java.util.Scanner;

class Snail00753 {
	public void solve() {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int u = in.nextInt();
		int d = in.nextInt();
		int f = in.nextInt();
		while (h != 0) {
			solve(h, u, d, f);
			h = in.nextInt();
			u = in.nextInt();
			d = in.nextInt();
			f = in.nextInt();
		}

	}

	private void solve(float h, float u, float d, float f) {
		float total = 0;
		int day = 0;
		float s = (float) (u * 1.0 * f / 100);
		while (u > 0 && total >= 0) {
			day++;
			total += u;
			if (total > h) {
				System.out.println("success on day " + day);
				return;
			}
			total -= d;
			u -= s;
		}

		while (total >=0) {
			total -= d;
			day++;
		}
		System.out.println("failure on day " + day);
	}
}
