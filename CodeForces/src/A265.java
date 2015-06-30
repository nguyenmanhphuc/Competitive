import java.util.Scanner;

public class A265 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char s[] = in.next().toCharArray();
		char t[] = in.next().toCharArray();
		int curIndex = 0;
		int tLength = t.length;
		for (char c : t) {
			if (c == s[curIndex]) {
				curIndex++;
			}
		}
		System.out.println(curIndex + 1);

	}

}
