import java.util.Scanner;

public class A435 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int count = 1;
		int cur = 0;
		for (int i = 0; i < n; ++i) {
			int temp = in.nextInt();
			if (cur + temp > m) {
				cur = temp;
				count++;
			} else {
				cur += temp;
			}
		}
		System.out.println(count);
	}

}
