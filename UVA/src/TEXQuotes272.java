import java.util.Scanner;

public class TEXQuotes272 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean first = true;
		
		while (in.hasNextLine()) {
			String s = in.nextLine();
			StringBuilder str = new StringBuilder();
			int l = s.length();
			for (int i = 0; i < l; ++i) {
				if (s.charAt(i) != '\"') {
					str.append(s.charAt(i));
				} else if (first) {
					str.append("``");
					first = !first;
				} else {
					first = !first;
					str.append("''");
				}
			}
			System.out.println(str);
		}
	}
}
