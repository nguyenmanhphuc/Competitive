import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BenderBRodríguezProblem {

	public void solve() {
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		while (L != 0) {
			String r = "+x";
			String arr[] = new String[L - 1];
			for (int i = 0; i < L - 1; ++i) {
				arr[i] = in.next();
			}

			for (int i = 0; i < L - 1; i++) {
				if (arr[i].equals("No")) {
					continue;
				}
				if ((r.equals("+x") && arr[i].equals("+y"))
						|| (r.equals("-x") && arr[i].equals("-y"))
						|| (r.equals("+y") && arr[i].equals("+z"))
						|| (r.equals("+y") && arr[i].equals("-z"))) {
					r = "+y";
				} else if ((r.equals("+x") && arr[i].equals("-y"))
						|| (r.equals("-x") && arr[i].equals("+y"))
						|| (r.equals("-y") && arr[i].equals("-z"))
						|| (r.equals("-y") && arr[i].equals("+z"))) {
					r = "-y";
				} else if ((r.equals("+x") && arr[i].equals("+z"))
						|| (r.equals("-x") && arr[i].equals("-z"))
						|| (r.equals("+z") && arr[i].equals("+y"))
						|| (r.equals("+z") && arr[i].equals("-y"))) {
					r = "+z";
				} else if ((r.equals("+x") && arr[i].equals("-z"))
						|| (r.equals("-x") && arr[i].equals("+z"))
						|| (r.equals("-z") && arr[i].equals("-y"))
						|| (r.equals("-z") && arr[i].equals("+y"))) {
					r = "-z";
				} else if ((r.equals("+z") && arr[i].equals("+z"))
						|| (r.equals("-y") && arr[i].equals("-y"))
						|| (r.equals("-z") && arr[i].equals("-z"))
						|| (r.equals("+y") && arr[i].equals("+y"))) {
					r = "-x";
				} else {
					r = "+x";
				}
			}
			System.out.println(r);
			L = in.nextInt();
		}

	}
}
