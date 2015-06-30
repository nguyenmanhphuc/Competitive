import java.util.Scanner;

public class C534 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long sum = 0;
		long total = in.nextLong();
		long[] dices = new long[n];
		for (int i = 0; i < n; ++i) {
			dices[i] = in.nextLong();
			sum += dices[i];
		}

		StringBuilder str = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			long sumLeft = sum - dices[i];
	
			long max = total - n + 1;
			long min = total - sumLeft;
			if (max > dices[i]) {
				max = dices[i];
			}

			if (min < 1) {
				min = 1;
			}

			long cur = dices[i] - (max - min + 1);
			
			if(i>0){
				str.append(' ');
			}
			str.append(cur);

		}
		System.out.println(str);

	}

}
