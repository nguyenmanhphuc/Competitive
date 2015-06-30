import java.util.Scanner;

public class A151 {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int l =in.nextInt();
		int c =in.nextInt();
		int d = in.nextInt();
		int p = in.nextInt();
		int nl =in.nextInt();
		int np =in.nextInt();
		int maxDrink = Math.min(c*d, k*l/nl);
		maxDrink  = Math.min(maxDrink, p/np);
		System.out.println(maxDrink/n);

	}
}
