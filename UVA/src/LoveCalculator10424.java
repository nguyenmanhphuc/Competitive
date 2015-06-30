import java.util.Scanner;

public class LoveCalculator10424 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String a = in.nextLine();
			String b = in.nextLine();
			int v1 = getValue(a);
			int v2 = getValue(b);
			double vA = get(v1);
			double vB = get(v2);
			if (vA < vB) {
				System.out
						.println(String.format("%.2f ", vA / vB * 100) + "%");
			} else {
				System.out
						.println(String.format("%.2f ", vB / vA * 100) + "%");
			}
		}

	}

	private static int get(int v2) {
		while (v2 > 9) {
			int temp = 0;
			while (v2 > 0) {
				temp += v2 % 10;
				v2 /= 10;
			}
			v2 = temp;
		}
		return v2;
	}

	private static int getValue(String a) {
		a = a.toLowerCase();
		int length = a.length();
		int result = 0;
		for (int i = 0; i < length; ++i) {
			if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a') {
				result += a.charAt(i) - 'a' + 1;
			}
		}
		return result;
	}
}
