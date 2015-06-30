import java.util.Scanner;

public class B379 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < n - 1; ++i) {
			int temp = in.nextInt();
			while (temp-- > 0) {
				str.append("PRL");
			}
			str.append('R');
		}
		int temp = in.nextInt();
		while (temp-- > 0) {
			str.append("PLR");
		}
		System.out.println(str);
	}

}
