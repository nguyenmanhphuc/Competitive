import java.util.Scanner;

public class C515 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nL = in.nextInt();
		char[] n = in.next().toCharArray();

		int count[] = new int[10];
		for (int i = 0; i < nL; ++i) {
			if (n[i] == '9') {
				count[7]++;
				count[2]++;
				count[3] += 2;
			} else if (n[i] == '8') {
				count[7]++;
				count[2] += 3;

			} else if (n[i] == '6') {
				count[3]++;
				count[5]++;
			} else if (n[i] == '4') {
				count[2] += 2;
				count[3]++;
			} else {
				count[n[i] - '0']++;
			}
		}
		for (int i = 9; i > 1; --i) {
			for (int j = 0; j < count[i]; ++j) {
				System.out.print(i);
			}
		}
		System.out.println();

	}

}
