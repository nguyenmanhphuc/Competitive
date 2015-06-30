import java.util.Scanner;

public class A219 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int count[] = new int[300];
		char[] s = in.next().toCharArray();
		int length = s.length;
		for (char i : s) {
			count[i]++;
		}
		if (length % k != 0) {
			System.out.println(-1);
			return;
		}

		StringBuilder str = new StringBuilder();
		for (int i = 'a'; i < 'z'; ++i) {
			if (count[i] % k != 0) {
				System.out.println("-1");
				return;
			}
		}
		for (int i = 0; i < k; ++i) {
			for (int j = 'a'; j <= 'z'; ++j) {
				int eachTime = count[j] / k;
				for (int h = 0; h < eachTime; ++h) {
					str.append((char) (j));
				}
			}
		}
		System.out.println(str);

	}
}
