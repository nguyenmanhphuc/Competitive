import java.util.Scanner;

public class A242 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int count = 0;
		StringBuilder str = new StringBuilder();
		for (int i = a; i <= x; ++i) {
			for (int j = b; j <= y & j < i; ++j) {
				str.append(i + " " + j + "\n");
				count++;
			}
		}
		System.out.println(count);
		System.out.println(str);
	}

}
