import java.util.Scanner;

public class B158 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int countBasePeople[] = new int[5];
		for (int i = 0; i < n; ++i) {
			countBasePeople[in.nextInt()]++;
		}

		int max = 0;
		int sumL = 0;

		max = countBasePeople[4] + countBasePeople[3];

		int min1 = Math.min(countBasePeople[1], countBasePeople[3]);
		countBasePeople[1] -= min1;
		max += countBasePeople[2] / 2;
		countBasePeople[1] += (countBasePeople[2] % 2 * 2);
		max += (countBasePeople[1] + 3) / 4;
		System.out.println(max);

	}
}
