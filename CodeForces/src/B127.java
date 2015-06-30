	import java.util.Scanner;
	
	public class B127 {
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			boolean oddTimes[] = new boolean[1000];
			int count = 0;
			for (int i = 0; i < n; ++i) {
				int t = in.nextInt();
				if (oddTimes[t]) {
					count++;
				}
				oddTimes[t] = !oddTimes[t];
			}
			System.out.println(count / 2);
	
		}
	
	}
