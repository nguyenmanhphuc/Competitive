import java.util.Hashtable;
import java.util.Scanner;

public class B499 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Hashtable<String, String> map = new Hashtable<>();
		for (int i = 0; i < m; ++i) {
			String f = in.next();
			String s = in.next();
			map.put(f, s);
		}
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			if (i != 0) {
				str.append(" ");
			}
			String l = in.next();
			String s = map.get(l);
			if (l.length() > s.length()) {
				str.append(s);
			}else{
				str.append(l);
			}
		}
		System.out.println(str);

	}
}
