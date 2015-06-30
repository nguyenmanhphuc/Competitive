import java.util.Scanner;

class BurgerTime {
	public void solve() {
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		while (L != 0) {
			in.nextLine();
			char[] arr = in.nextLine().toCharArray();
			int lastDrugStore = -1;
			int lastRestaurant = -1;
			int minDistance = Integer.MAX_VALUE;
			for (int i = 0; i < L; ++i) {
				if (arr[i] == 'Z') {
					minDistance = 0;
					break;
				} else if (arr[i] == 'R') {
					lastRestaurant = i;
					if (lastDrugStore != -1) {
						minDistance = Math.min(minDistance, i - lastDrugStore);
					}
				} else if (arr[i] == 'D') {
					lastDrugStore = i;
					if (lastRestaurant != -1) {
						minDistance = Math.min(minDistance, lastDrugStore
								- lastRestaurant);
					}
				}
			}
			System.out.println(minDistance);
			L = in.nextInt();
		}
	}
}
