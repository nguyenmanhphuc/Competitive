import java.util.Scanner;

public class A237 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		int preHour = -1;
		int preMinutes = -1;
		int max = 0;
		for (int i = 0; i < n; ++i) {
			int hour = in.nextInt();
			int minutes = in.nextInt();
			if (preHour != hour || preMinutes != minutes) {
				max = Math.max(count, max);
				count = 1;
				preHour = hour;
				preMinutes = minutes;
			}else{
				count++;
			}
		}
		max = Math.max(count, max);
		System.out.println(max);
	}
}
