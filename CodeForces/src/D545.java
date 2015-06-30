import java.util.Arrays;
import java.util.Scanner;

public class D545 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] people = new Integer[n];
		for (int i = 0; i < n; ++i) {
			people[i] = in.nextInt();
		}

		Arrays.sort(people);
		int count = 0;
		long sum = 0;
		for (Integer person : people) {
			if (person >= sum) {
				count++;
				sum += person;
			}

		}
		System.out.println(count);
	}

}
