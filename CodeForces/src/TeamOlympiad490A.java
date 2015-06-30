import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamOlympiad490A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int countGoodStudents[] = new int[4];
		List<Integer>[] goods = new List[4];
		for (int i = 1; i <= 3; ++i) {

			goods[i] = new ArrayList<>();
		}
		for (int i = 1; i <= n; ++i) {
			int good = in.nextInt();
			goods[good].add(i);
			countGoodStudents[good]++;
		}
		int result = Math.min(countGoodStudents[1], countGoodStudents[2]);
		result = Math.min(result, countGoodStudents[3]);

		StringBuilder resultString = new StringBuilder();
		resultString.append(result);
		resultString.append("\n");
		for (int i = 0; i < result; ++i) {
			resultString.append(goods[1].get(i));
			resultString.append(" ");
			resultString.append(goods[2].get(i));
			resultString.append(" ");
			resultString.append(goods[3].get(i));
			resultString.append("\n");
		}

		System.out.println(resultString);
	}
}
