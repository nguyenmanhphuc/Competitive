import java.util.Scanner;

public class A525 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char s[] = in.next().toCharArray();
		int need = 0;
		int count[] = new int[300];
		int con = 'a' - 'A';

		for (int i = 0; i < 2*n-2; ++i) {
			count[s[i]]++;
			i++;
			int t = s[i] + con;
			if (count[t] == 0) {
				need++;
			} else {
				count[t]--;
			}
		}
		System.out.println(need);

	}
}
