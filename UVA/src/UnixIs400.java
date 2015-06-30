import java.util.Arrays;
import java.util.Scanner;

public class UnixIs400 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();
			String[] names = new String[n];
			in.nextLine();
			int maxL = 0;
			for (int i = 0; i < n; ++i) {
				names[i] = in.nextLine();
				maxL = Math.max(maxL, names[i].length());
			}
			int cols = 0;
			while (cols * (maxL + 2) + maxL <= 60) {
				cols++;
			}
			int rows = (n + cols - 1) / cols;
			StringBuilder str = new StringBuilder();
			for (int i = 0; i < 60; ++i) {
				str.append('-');
			}
			str.append('\n');
			Arrays.sort(names);
			for (int i = 0; i < rows; ++i) {
				for (int j = 0; j < cols; ++j) {
					int pos = i + j * rows;
					if (pos < n) {
						int l = names[pos].length();
						str.append(names[pos]);
						int end = j == cols - 1 ? maxL : maxL + 2;
						for (; l < end; ++l) {
							str.append(' ');
						}
					}
				}
				str.append('\n');
			}
			System.out.print(str);
		}

	}
}
