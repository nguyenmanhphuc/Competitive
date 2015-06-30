import java.util.Arrays;
import java.util.Scanner;

public class ListConquests10420 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] countries = new String[n];
		for (int i = 0; i < n; ++i) {
			countries[i] = in.next();
			in.nextLine();
		}
		Arrays.sort(countries);
		StringBuilder result = new StringBuilder();
		int count = 0;
		String current = "";
		for (int i = 0; i < n; ++i) {
			if (!countries[i].equals(current)) {

				if (!current.equals("")) {
					result.append(current);
					result.append(' ');
					result.append(count);
					result.append("\n");
				}
				count = 1;
				current = countries[i];
			} else {
				count++;
			}
		}
		if (!current.equals("")) {
			result.append(current);
			result.append(' ');
			result.append(count);
			result.append("\n");
		}
		System.out.print(result);
	}
}
