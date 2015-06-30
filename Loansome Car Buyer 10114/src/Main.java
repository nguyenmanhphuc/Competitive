import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	static Scanner in;

	public static void main(String[] args) throws FileNotFoundException {
		in = new Scanner(System.in);
		int dur = in.nextInt();
		while (dur >= 0) {
			solve(dur);
			dur = in.nextInt();
		}
	}

	private static void solve(int dur) {
		double pEM = in.nextDouble();
		double total = in.nextDouble();
		int countM = in.nextInt();
		double arr[] = new double[dur + 1];
		Arrays.fill(arr, -1);
		for (int i = 0; i < countM; ++i) {
			arr[in.nextInt()] = in.nextDouble();
		}

		for (int i = 1; i <= dur; ++i) {
			if (arr[i] == -1) {
				arr[i] = arr[i - 1];
			}
		}

		double carValue = total + pEM;
		int m = 0;
		carValue *= (1 - arr[m]);
		pEM = total / dur;
		while (total >= carValue) {
			total -= pEM;
			m++;
			carValue *= (1 - arr[m]);
		}

		if (m == 1) {
			System.out.println("1 month");
		} else {
			System.out.println(m + " months");
		}
	}

}
