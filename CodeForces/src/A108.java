import java.util.Scanner;

public class A108 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char s[] = in.next().toCharArray();
		int h = (s[0] - '0') * 10 + s[1] - '0';
		int m = (s[3] - '0') * 10 + s[4] - '0';
		int temp = (s[1] - '0') * 10 + s[0] - '0';
		if (temp > m && temp < 60) {
			System.out.println(String.format("%02d:%02d", h, temp));
			return;
		}
		for (int i = h + 1; i < 24; ++i) {
			for (int j = 0; j < 60; ++j) {
				if (i / 10 == j % 10 && j / 10 == i % 10) {
					System.out.println(String.format("%02d:%02d", i, j));
					return;
				}
			}
		}
		System.out.println("00:00");
	}
}
