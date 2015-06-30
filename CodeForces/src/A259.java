	import java.util.Scanner;
	
	public class A259 {
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			for (int i = 0; i < 8; ++i) {
				char[] row = in.next().toCharArray();
				for (int j = 1; j < 8; ++j) {
					if (row[j] == row[j - 1]) {
						System.out.println("NO");
						return;
					}
				}
			}
			System.out.println("YES");
		}
	
	}
