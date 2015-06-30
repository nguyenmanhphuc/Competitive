import java.util.Scanner;

public class A41 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		char[] t = in.next().toCharArray();
		if (s.length != t.length) {
			System.out.println("NO");
			return;
		}
		int i = 0;
		int j = s.length - 1;
		while (i < s.length) {
			if(s[i]!=t[j]){
				System.out.println("NO");
				return;
			}
			i++;
			j--;
		}
		System.out.println("YES");

	}

}
