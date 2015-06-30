	import java.io.PrintWriter;
	import java.util.Scanner;
	
	public class M100694 {
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int q = in.nextInt();
			PrintWriter writer = new PrintWriter(System.out);
			for (int i = 0; i < q; ++i) {
				int k = in.nextInt();
				int l = in.nextInt();
				if (i > 0) {
					System.out.print(' ');
					// writer.print(' ');
				}
	
				int sum = k + l;
				// writer.print((n - k + 1 + l - 1) / l);
				int mod = n % sum;
				if (mod >= k && mod < sum) {
					System.out.print(n / sum * 2 + 1);
				} else {
					System.out.print(n / sum * 2 );
				}
	
			}
			writer.println();
			writer.close();
	
		}
	}
