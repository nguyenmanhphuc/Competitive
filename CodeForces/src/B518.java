import java.util.Scanner;

public class B518 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		char[] t = in.next().toCharArray();

		int countS[] = new int[300];
		int countT[] = new int[300];

		int sL = s.length;
		int tL = t.length;
		for (int i = 0; i < sL; ++i) {
			countS[s[i]]++;
		}

		for (int i = 0; i < tL; ++i) {
			countT[t[i]]++;
		}

		int y = 0;
		int w = 0;
		int con = 'a' - 'A';
		for (int i = 'a'; i <= 'z'; ++i) {
			int min = Math.min(countS[i], countT[i]);
			y += min;
			countS[i] -= min;
			countT[i] -= min;
		}

		for (int i = 'A'; i <= 'Z'; ++i) {
			int min = Math.min(countS[i], countT[i]);
			y += min;
			countS[i] -= min;
			countT[i] -= min;
		}

		for (int i = 'A'; i <= 'Z'; ++i) {
			int j = i + con;
			int min = Math.min(countS[i], countT[j]);
			w += min;
			countS[i] -= min;
			countT[j] -= min;

			min = Math.min(countS[j], countT[i]);
			w += min;
			countS[j] -= min;
			countT[i] -= min;
		}

		System.out.println(y + " " + w);

	}

}
