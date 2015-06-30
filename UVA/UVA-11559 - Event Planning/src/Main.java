/*import java.util.Scanner;
 class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int b = in.nextInt();
			int h = in.nextInt();
			int w = in.nextInt();
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < h; ++i) {
				int price = in.nextInt();
				for (int j = 0; j < w; ++j) {
					int temp = in.nextInt();
					if (temp >= n) {
						min = Math.min(min, n * price);
					}
				}
			}
			
			if(min>b){
				System.out.println("stay home");
			}else{
				System.out.println(min);
			}
		}

	}

}
*/

import java.util.Scanner;

 class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int t = in.nextInt();
		for (int i = 0; i < t; ++i) {
			solve();
		}

	}

	private static void solve() {
		int n = in.nextInt();
		int f = in.nextInt();
		P[][] ps = new P[n][2];
		ps[0][1] = new P(f, f);
		ps[0][0] = new P(f, f);
		int value[] = new int[n];
		value[0] = f;
		long result = 1;
		for (int i = 1; i < n; ++i) {
			value[i] = in.nextInt();
			ps[i][0] = new P(1, value[i]);
			ps[i][1] = new P(1, value[i]);
			for (int j = 0; j < i; ++j) {
				if (value[i] > value[j]) {
					long max = ps[j][0].max + 1;
					if (max > ps[i][0].max) {
						ps[i][0].max = max;
						ps[i][0].other = ps[j][0].other;
					} else if (max > ps[i][0].max) {
						ps[i][0].other = Math.max(ps[i][0].other,
								ps[j][0].other);
					}
				} else {
					long max = ps[j][1].max + 1;
					if (max > ps[i][1].max) {
						ps[i][1].max = max;
						ps[i][1].other = ps[j][1].other;
					} else if (max > ps[i][1].max) {
						ps[i][1].other = Math.min(ps[i][1].other,
								ps[j][1].other);
					}
				}
			}
			
			result = Math.max(ps[i][0].max, result);
			result = Math.max(ps[i][1].max, result);
		}
		System.out.println(result);
	}

}

class P {
	long max;
	long other;

	public P(long max, long other) {
		this.max = max;
		this.other = other;
	}

}