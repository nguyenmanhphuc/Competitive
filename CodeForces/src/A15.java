import java.util.Arrays;
import java.util.Scanner;

public class A15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int t = in.nextInt();

		House[] houses = new House[n];

		for (int i = 0; i < n; ++i) {
			houses[i] = new House(in.nextInt(), in.nextInt());
		}

		Arrays.sort(houses);
		int count = 0;
		for (int j = 1; j < n; ++j) {
			double length = houses[j].a - houses[j-1].a
					- (houses[j].b + houses[j - 1].b) / 2;

			if (length == t) {
				count++;
			} else if(length>t){
				count += 2;
			}
		}
		count += 2;
		System.out.println(count);

	}
}

class House implements Comparable<House> {
	public double a;
	public double b;

	public House(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public int compareTo(House a) {
		return Double.compare(this.a, a.a);
	}
}
