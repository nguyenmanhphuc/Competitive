import java.util.PriorityQueue;
import java.util.Scanner;

public class B344 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int[] arr = new int[3];
		if (c > a && c > b) {
			if (a + b < c || -(c - a - b) % 2 == 1) {
				System.out.println("Impossible");
				return;
			}
			arr[0] = -(c - a - b) / 2;
			arr[1] = b - arr[0];
			arr[2] = a - arr[0];
		} else if (a > b && a > c) {
			if (c + b < a || -(a - c - b) % 2 == 1) {
				System.out.println("Impossible");
				return;
			}
			arr[1] = -(a - c - b) / 2;
			arr[0] = b - arr[1];
			arr[2] = c - arr[1];

		} else {
			if (c + a < b || (-(b - c - a)) % 2 == 1) {
				System.out.println("Impossible");
				return;
			}
			arr[2] = -(b - c - a) / 2;
			arr[0] = a - arr[2];
			arr[1] = c - arr[2];
		}

		System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
	}
}

class Atom implements Comparable<Atom> {
	public int index;
	public int value;
	public int bonds;

	public Atom(int index, int value) {
		super();
		this.index = index;
		this.value = value;
	}

	@Override
	public int compareTo(Atom a) {
		return this.value - a.value;
	}

}
