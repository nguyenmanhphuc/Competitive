import java.util.Scanner;

public class B1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n-- > 0) {
			String s = in.next();
			if (s.charAt(0) == 'R' && s.charAt(1) >= '0' && s.charAt(1) <= '9'
					&& s.indexOf('C') > 0) {
				int c = s.indexOf('C');
				String r = s.substring(1, c);
				long z = Long.parseLong(s.substring(c + 1));
				int cons = 'Z' - 'A' + 1;
				StringBuilder cols = new StringBuilder();
				z--;
				/*
				 * while (z > 0) { int t = (int) (z % cons); if (t == 0) {
				 * cols.append('Z'); } else { cols.append((char) (t + 'A' - 1));
				 * } z /= cons; }
				 */
				int t = (int) (z % cons);
				cols.append((char) (t + 'A'));
				z /= cons;
				while (z > 0) {
					t = (int) (z % cons);
					if (t == 0) {
						cols.append('Z');
						z /= cons;
						z--;
					} else {
						cols.append((char) (t + 'A' - 1));
						z /= cons;
					}

				}
				if (cols.length() == 0) {
					cols.append("A");
				}
				System.out.println(cols.reverse() + r);

			} else {
				String c = "";
				String r = "";
				for (int i = 0; i < s.length(); ++i) {
					if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
						r = s.substring(i);
						break;
					} else {
						c += s.charAt(i);
					}
				}
				int l = c.length();
				long cols = 0;
				int cons = 'Z' - 'A' + 1;
				int z = 1;
				for (int i = l - 1; i >= 0; --i) {
					cols += z * (c.charAt(i) - 'A' + 1);
					z *= cons;
				}
				System.out.println("R" + r + "C" + cols);
			}
		}

	}
}
