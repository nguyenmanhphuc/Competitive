import java.util.PriorityQueue;
import java.util.Scanner;

public class B218 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] planes = new int[m];
		for (int i = 0; i < m; ++i) {
			planes[i] = in.nextInt();
		}

		int min = getMin(n, planes);
		int max = getMax(n, planes);
		System.out.println(max + " " + min);

	}

	private static int getMax(int n, int[] planes) {
		PriorityQueue<Integer> plane = new PriorityQueue<>();
		int m = planes.length;
		for (int i = 0; i < m; i++) {
			plane.add(-planes[i]);
		}

		int max = 0;
		while (n > 0 && !plane.isEmpty()) {
			Integer seat = plane.poll();
			if (seat >= 0) {
				break;
			}
			max += -seat;
			seat++;
			if (seat < 0) {
				plane.add(seat);
			}
			n--;
		}

		return max;
	}

	private static int getMin(int n, int[] planes) {
		PriorityQueue<Integer> plane = new PriorityQueue<>();
		int m = planes.length;
		for (int i = 0; i < m; i++) {
			plane.add(planes[i]);
		}

		int min = 0;
		while (n > 0 && !plane.isEmpty()) {
			Integer seat = plane.poll();
			if (seat <= 0) {
				break;
			}
			min += seat;
			seat--;
			if (seat > 0) {
				plane.add(seat);
			}
			n--;
		}

		return min;
	}

}
