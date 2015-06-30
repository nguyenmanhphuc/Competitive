import java.util.Scanner;

public class A387 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();

		int wakeupHour = Integer.parseInt(s.substring(0, 2));
		int wakeupMinutes = Integer.parseInt(s.substring(3, 5));

		int lastHour = Integer.parseInt(t.substring(0, 2));
		int lastMinutes = Integer.parseInt(t.substring(3, 5));

		long last = lastHour * 60 + lastMinutes;
		long wakeup = wakeupHour * 60 + wakeupMinutes;

		long sleep = wakeup - last;
		if (sleep < 0) {
			sleep += 60 * 24;
		}
		
		System.out.println(String.format("%02d:%02d", sleep / 60, sleep % 60));
	}

}
