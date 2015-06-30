import java.util.Scanner;

public class B230 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double sum = 0;
		for (int i = 0; i < n; ++i) {
			sum += in.nextDouble();
		}
		System.out.println(sum / n);

	}

}
