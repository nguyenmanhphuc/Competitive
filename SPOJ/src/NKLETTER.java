import java.util.Scanner;

public class NKLETTER {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] sB = in.nextLine().toCharArray();
		char[] sE = in.nextLine().toCharArray();
		int bLength = sB.length;
		int eL = sE.length;
		int i = eL >= bLength ? 0 : bLength - eL;
		for (; i < bLength; ++i) {
			boolean check = true;
			int k = 0;
			for (int j = i; j < bLength; ++j, k++) {
				if (sB[j] != sE[k]) {
					check = false;
					break;
				}
			}
			if (check) {
				System.out.println(eL + i);
				return;
			}
		}
		System.out.println(eL + bLength);
	}

}
