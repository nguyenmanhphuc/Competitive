import java.util.Scanner;

public class B545 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[][] strs = new char[2][];
		strs[0] = in.next().toCharArray();
		strs[1] = in.next().toCharArray();
		int length = strs[0].length;
		int count = 0;
		char[] r = new char[length];
		int l = 0;
		for (int i = 0; i < length; ++i) {
			if (strs[0][i] != strs[1][i]) {
				r[i] = strs[1 - l][i];
				l = 1 - l;
			}else{
					r[i] = strs[0][i];
			}
		}
		if (l == 0) {
			System.out.println(new String(r));
		} else {
			System.out.println("IMPOSSIBLE".toLowerCase());
		}

	}
}
