import java.util.Scanner;

public class A106 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char trum = in.next().toCharArray()[0];
		String first = in.next();
		String second = in.next();
		int arr[] = new int[300];
		arr['6'] = 1;
		arr['7'] = 2;
		arr['8'] = 3;
		arr['9'] = 4;
		arr['T'] = 5;
		arr['J'] = 6;
		arr['Q'] = 7;
		arr['K'] = 8;
		arr['A'] = 9;
		if (first.charAt(1) == second.charAt(1)) {
			System.out
					.println(arr[first.charAt(0)] > arr[second.charAt(0)] ? "YES"
							: "NO");
		}

		else if (first.charAt(1) == trum) {

			System.out.println("YES");

		} else {
			System.out.println("NO");
		}
	}

}
