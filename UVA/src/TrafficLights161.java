import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrafficLights161 {
	static List<Integer> time;
	static int size;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int first = 0;
		int end = 5 * 3600;
		while ((first = in.nextInt()) != 0) {
			time = new ArrayList<Integer>();
			time.add(first);
			int next = 0;
			while ((next = in.nextInt()) != 0) {
				time.add(next);
			}
			size = time.size();
			String result = null;
			int r = 0;
			for (int i = 0; i <= end; ++i) {
				if (checkTime(i)) {

					result = getResult(i);
					break;

				}
			}
			if (result == null) {
				result = "Signals fail to synchronise in 5 hours";
			}
			System.out.println(result);
		}
	}

	private static String getResult(int i) {
		String s = String.format("%02d:", i / 3600);
		i %= 3600;
		s += String.format("%02d:", i / 60);
		i %= 60;
		s += String.format("%02d", i);
		return s;
	}

	private static boolean checkTime(int testTime) {
		int z = 0;
		for (int i = 0; i < size; ++i) {
			int cur = time.get(i);
			if (cur <= testTime) {
				z = 1;
			}
			int t = testTime % (cur << 1);
			if (t >= cur - 5) {
				return false;
			}
		}
		return z > 0;
	}
}
