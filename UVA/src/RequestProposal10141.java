import java.util.Scanner;

class RequestProposal10141 {
	public void solve() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		int index = 1;
		while (n + p != 0) {
			if (index != 1) {
				System.out.println();
			}
			for (int i = 0; i <= n; ++i) {
				String s = in.nextLine();
			}

			double compliance = -1;
			String resultName = "";
			double resultPrice = Double.MAX_VALUE;
			for (int i = 0; i < p; ++i) {
				String name = in.nextLine();
				double price = in.nextDouble();
				double nMetReqs = in.nextDouble();
				double curCompliance = nMetReqs / n;
				if (compliance < curCompliance
						|| (curCompliance == compliance && price < resultPrice)) {
					resultName = name;
					resultPrice = price;
					compliance = curCompliance;
				}
				for (int j = 0; j <= nMetReqs; ++j) {
					String s = in.nextLine();
				}
			}

			System.out.println("RFP #" + index);
			System.out.println(resultName);
			index++;
			n =in.nextInt();
			p = in.nextInt();
		}
	}
}
