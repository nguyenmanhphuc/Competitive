import java.util.Scanner;

public class A114 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long k = in.nextLong();
		long l = in.nextLong();
		long temp = k;
		int count = 0;
		while (temp < l) {
			temp *= k;
			count++;
		}

		
		if (temp == l) {
			System.out.println("YES");
			System.out.println(count);
		} else {
			System.out.println("NO");
		}

	}

}
