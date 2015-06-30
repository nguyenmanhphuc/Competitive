import java.util.Scanner;

public class BlowingFuses661 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int c = in.nextInt();
		int cas = 1;
		while (n != 0 && m != 0 && c != 0) {
	
			boolean isOn[] = new boolean[n + 1];
			int consumptions[] = new int[n + 1];
			for (int i = 1; i <= n; ++i) {
				consumptions[i] = in.nextInt();
			}
			int max = 0;
			int current = 0;
			for (int i = 0; i < m; ++i) {
				int temp = in.nextInt();
				if (!isOn[temp]) {
					current += consumptions[temp];
					max = Math.max(current, max);
				} else {
					current -= consumptions[temp];
				}
				isOn[temp] = !isOn[temp];
			}
			if (max > c) {
				System.out.println("Sequence " + cas++ + "\nFuse was blown.");
			} else {
				System.out.println("Sequence " + cas++
						+ "\nFuse was not blown.\nMaximal power consumption was "
						+ max + " amperes.");
			}
			System.out.println();
			n = in.nextInt();
			m = in.nextInt();
			c = in.nextInt();
		}

	}

}
