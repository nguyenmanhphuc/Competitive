import java.util.Scanner;

public class PeterSmokes10346 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int k = in.nextInt();
			int result = 0;
			do {
				int time = n / k;
				result += k * time;
				n %= k;
				n += time;
			} while (n >= k);
			result += n;
			System.out.println(result);
		}

	}
}
