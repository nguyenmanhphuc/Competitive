import java.util.Scanner;

public class B266 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		char[] students = in.next().toCharArray();
		for (int i = 0; i < t; ++i) {
			for (int j = n-2; j >=0; --j) {
				if (students[j] == 'B' && students[j + 1] == 'G') {
					students[j + 1] = 'B';
					students[j] = 'G';
					j--;
				}
			}
		}
		System.out.println(new String(students));

	}

}
