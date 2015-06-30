import java.util.Scanner;

public class A92 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int r = (n * (n + 1)) >>1;
		int l = m % r;

		int i = 1;
		while (l > 0) {
			if (l < i) {
				break;
			}
			l -= i;
			i++;
		}
		
		System.out.println(l);

	}
}
