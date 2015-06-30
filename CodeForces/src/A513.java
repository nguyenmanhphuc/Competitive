import java.util.Scanner;

public class A513 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		int h = in.nextInt();
		int t = (n + k - 1) / k;
		int p = (m + h - 1) / h;
		System.out.println(n > m ? "First" : "Second");

	}

}
