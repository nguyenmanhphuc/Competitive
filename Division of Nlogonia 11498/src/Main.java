import java.util.Scanner;

 class Main {
	static StringBuilder str = new StringBuilder();
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int k =in.nextInt();
		while (k!=0) {
			
			solve(k,in.nextInt(), in.nextInt());
			k  =in.nextInt();
		}
		System.out.print(str.toString());

	}

	private static void solve(int k, int n, int m) {
		
		while (k-- > 0) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (a == n || b == m) {
				str.append("divisa\n");
			} else if (a < n) {
				if (b < m) {
					str.append("SO\n");
				} else {
					str.append("NO\n");
				}
			} else {
				if (b < m) {
					str.append("SE\n");
				} else {
					str.append("NE\n");
				}
			}
		}
	}
}
