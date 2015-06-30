import java.util.Scanner;

public class A262 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int result = 0;
		for (int i = 0; i < n; ++i) {
			char[] number = in.next().toCharArray();
			int count = 0;
			int length = number.length;
			for (char c : number) {
				if (c == '4' || c == '7') {
					count++;
				}
			}
			if (count <= k) {
				result++;
			}
		}
		System.out.println(result);
	}

}
