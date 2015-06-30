import java.util.Scanner;

public class A221 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		StringBuilder str = new StringBuilder();
		str.append(n);
		for (int i = 1; i < n; ++i) {
			str.append(' ');
			str.append(i);
		}
		
		System.out.println(str);

	}

}
